/**
 * 
 */
package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import model.*;

public class BlackjackGUI extends JPanel {
	
	//Indicateurs des défaites consécutives
	static int vicCons ;
	static int nbWin = 0 ;
	static int nbGame = 0 ;
	
	// Les JPannels de la fenêtres
	JPanel top = new JPanel();
	JPanel carteCroupierPanel = new JPanel();
	JPanel carteJoueurPanel = new JPanel();
	JPanel stats = new JPanel();

	
	// La zone de texte qui affiche l'état de la partie (Victoire, Défaite, Egalité)
	JTextPane winLoseBox = new JTextPane();
	
	// Les différents boutons qui sont utilisé
	JButton boutonPiocher = new JButton();
	JButton boutonDemarrer = new JButton();
	JButton boutonPasser = new JButton();
	JButton boutonRecommencer = new JButton();
	
	// Affiche les scores du joueur et du croupier et les défaites
	JLabel labelCroupier = new JLabel();
	JLabel labelJoueur = new JLabel();
	JLabel labelStats = new JLabel();	
	
	// Le joueur et le croupier
	Croupier croupier = new Croupier();
	Joueur joueur = new Joueur();
	BlackJack partie = new BlackJack(croupier,joueur);
	
	// Contient les images des cartes
	JLabel joueurCarte1;
	JLabel joueurCarte2;
	JLabel joueurCartePioche;
	JLabel croupierCarte0;
	JLabel croupierCarte1;
	JLabel croupierCarte2;
	JLabel croupierCartePioche;
	
	/**
	 * Constructeur
	 */
	public BlackjackGUI()
	{		
		top.setBackground(Color.GREEN);
		carteCroupierPanel.setBackground(Color.GREEN);
		carteJoueurPanel.setBackground(Color.GREEN);
		stats.setBackground(Color.GREEN);
		
		top.setLayout(new FlowLayout());
		winLoseBox.setText(" ");
		winLoseBox.setFont(new Font("Helvetica Bold", 1, 20));
		
		/**
		 * Le bouton demarrer
		 */
		boutonDemarrer.setText(" Commencer ");
		boutonDemarrer.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				nbGame ++;
				
				carteCroupierPanel.add(labelCroupier);
				carteJoueurPanel.add(labelJoueur);
				stats.add(labelStats);
				
			
				croupierCarte0 = new JLabel(new ImageIcon("img/cartes/dos.png"));
				partie.initialisationPartie();
				
				Carte carteCroupier = null;
				Iterator<Carte> cscan =(croupier.getMain()).iterator();
				int compteC = 0;
				while (cscan.hasNext())
				{
					carteCroupier = cscan.next();
					if (compteC == 0)
					{
						croupierCarte1 = new JLabel(carteCroupier.getImgCarte());
					}
					else
					{
						croupierCarte2 = new JLabel(carteCroupier.getImgCarte());
					}
					compteC ++;
				}
				
				Carte carteJoueur = null;
				Iterator<Carte> jscan = joueur.getMain().iterator();
				int compteJ = 0;
				while (jscan.hasNext())
				{
					carteJoueur = jscan.next();
					if (compteJ == 0)
					{
						joueurCarte1 = new JLabel(carteJoueur.getImgCarte());
					}
					else
					{
						joueurCarte2 = new JLabel(carteJoueur.getImgCarte());
					}
					compteJ ++;
				}
				
				carteCroupierPanel.add(croupierCarte0);
				carteCroupierPanel.add(croupierCarte2);
				
				carteJoueurPanel.add(joueurCarte1);
				carteJoueurPanel.add(joueurCarte2);
				
				
				
				labelCroupier.setText(" Croupier: " + carteCroupier.getValeur());
				labelJoueur.setText(" Joueur: " + partie.valeurMain(joueur));
				
				
				boutonPiocher.setEnabled(true);
				boutonPasser.setEnabled(true);
				boutonDemarrer.setEnabled(false);
				
				if(partie.blackj())
				{
					boutonPiocher.setEnabled(false);
					boutonPasser.setEnabled(false);
					boutonDemarrer.setEnabled(false);
					boutonRecommencer.setEnabled(true);
					winLoseBox.setText("Blackjack!");
				}	
				add(stats,BorderLayout.WEST);
				add(carteCroupierPanel, BorderLayout.CENTER);
				add(carteJoueurPanel, BorderLayout.SOUTH);
			}	
		});
		
		/**
		 * Le bouton piocher
		 */
		boutonPiocher.setText("Piocher");
		boutonPiocher.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Carte carteTiree = partie.piocher(joueur);
				joueurCartePioche = new JLabel (carteTiree.getImgCarte());
				carteJoueurPanel.add(joueurCartePioche);
				carteJoueurPanel.repaint();
				
				if (partie.echec(joueur))
				{
					winLoseBox.setText(partie.fin());
					boutonPiocher.setEnabled(false);
					boutonPasser.setEnabled(false);
					boutonDemarrer.setEnabled(false);
					boutonRecommencer.setEnabled(true);
				}
				
				labelJoueur.setText("Joueur: " + partie.valeurMain(joueur));
			}
		});
		
		/**
		 * Bouton passer
		 */
		boutonPasser.setText("Se coucher");
		boutonPasser.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				carteCroupierPanel.remove(croupierCarte0);
				carteCroupierPanel.add(croupierCarte1);
				
				croupier = (Croupier) partie.minCroupier();
				carteCroupierPanel.removeAll();
				carteCroupierPanel.add(labelCroupier);
				labelCroupier.setText(labelCroupier.getText());
				
				Carte croupierCarteTiree = null;
				Iterator<Carte> scan = (croupier.getMain().iterator());
				while(scan.hasNext())
				{
					croupierCarteTiree = scan.next();
					croupierCartePioche = new JLabel (croupierCarteTiree.getImgCarte());
					carteCroupierPanel.add(croupierCartePioche);
				}
				
				labelCroupier.setText("Croupier: " + partie.valeurMain(croupier));
				labelJoueur.setText("Joueur: " + partie.valeurMain(joueur));
				
				winLoseBox.setText(partie.fin());
				//defaiteConsecutives();
				boutonPiocher.setEnabled(false);
				boutonPasser.setEnabled(false);
				boutonRecommencer.setEnabled(true);
			}
		});
		
		/**
		 * Bouton rejouer
		 */
		boutonRecommencer.setText("Rejouer");
		boutonRecommencer.addActionListener(new ActionListener()
		{
			@Override 
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				labelCroupier.setText("Croupier: ");
				labelJoueur.setText("Joueur:  ");
				

				// Appel des différentes méthodes pour les stats
				Stats.vicCons(partie.getResultat());
				
				// String destiné au label stats
				String str = "<html>Victoire consécutives: " + vicCons + "<br/>"
						+ "Taux de victoire: " + Stats.winRate(nbWin, nbGame)+ "%";
				
				labelStats.setText(str);
				
				croupier = new Croupier();
				joueur = new Joueur();
				partie = new BlackJack(croupier, joueur);
				
				carteCroupierPanel.removeAll();
				carteJoueurPanel.removeAll();
				
				boutonDemarrer.setEnabled(true);
				boutonPiocher.setEnabled(false);
				boutonPasser.setEnabled(false);
				boutonRecommencer.setEnabled(false);
			}
		});
		
		top.add(winLoseBox);
		top.add(boutonDemarrer);
		top.add(boutonPiocher);
		top.add(boutonPasser);
		top.add(boutonRecommencer);
		
		carteCroupierPanel.add(labelCroupier);
		carteJoueurPanel.add(labelJoueur);
		stats.add(labelStats);		
		
		setLayout(new BorderLayout());
		add(top,  BorderLayout.NORTH);
		add(carteCroupierPanel,  BorderLayout.CENTER);
		add(carteJoueurPanel,  BorderLayout.SOUTH);
		add(stats, BorderLayout.WEST);
	}

	/**
	 * Methode qui créer et lance a fenêtre du jeu
	 */
	public void lancerJeu() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Blackjack");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(this);
		frame.setPreferredSize(new Dimension(1280, 800));
		
		frame.pack();
		frame.setVisible(true);
	}
	


	/**
	 * @return the nbWin
	 */
	public static int getNbWin() {
		return nbWin;
	}

	/**
	 * @param nbWin the nbWin to set
	 */
	public static void setNbWin(int d) {
		nbWin = d;
	}

	/**
	 * @return the nbGame
	 */
	public static  int getNbGame() {
		return nbGame;
	}

	/**
	 * @param nbGame the nbGame to set
	 */
	public static void setNbGame(int nb) {
		nbGame = nb;
	}
	/**
	 * @return the defcons
	 */
	public static int getVicCons() {
		return vicCons;
	}

	/**
	 * @param defcons the defcons to set
	 */
	public static void setVicCons(int vicCons) {
		BlackjackGUI.vicCons = vicCons;
	}
}
