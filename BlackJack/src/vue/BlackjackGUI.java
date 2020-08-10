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
	
	JPanel top = new JPanel();
	JPanel carteCroupierPanel = new JPanel();
	JPanel carteJoueurPanel = new JPanel();
	
	JTextPane winLoseBox = new JTextPane();
	
	JButton boutonPiocher = new JButton();
	JButton boutonDemarrer = new JButton();
	JButton boutonPasser = new JButton();
	JButton boutonRecommencer = new JButton();
	
	JLabel labelCroupier = new JLabel();
	JLabel labelJoueur = new JLabel();
	
	Joueur croupier = new Joueur();
	Joueur joueur = new Joueur();
	BlackJack partie = new BlackJack(croupier,joueur);
	
	JLabel joueurCarte1;
	JLabel joueurCarte2;
	JLabel joueurCartePioche;
	JLabel croupierCarte0;
	JLabel croupierCarte1;
	JLabel croupierCarte2;
	JLabel croupierCartePioche;
	
	public BlackjackGUI()
	{
		top.setBackground(Color.GREEN);
		carteCroupierPanel.setBackground(Color.GREEN);
		carteJoueurPanel.setBackground(Color.GREEN);
		
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
				carteCroupierPanel.add(labelCroupier);
				carteJoueurPanel.add(labelJoueur);
				
				/**
				 * 
				 */
				croupierCarte0 = new JLabel(new ImageIcon("img/carte/back.jpg"));
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
				
				Iterator<Carte> jscan = joueur.getMain().iterator();
				int compteJ = 0;
				while (jscan.hasNext())
				{
					Carte carteJoueur = cscan.next();
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
				
				labelCroupier.add(croupierCarte0);
				labelCroupier.add(croupierCarte2);
				
				labelJoueur.add(joueurCarte1);
				labelJoueur.add(joueurCarte2);
				
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
					winLoseBox.setText("Blacjack!");
				}
				
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
					winLoseBox.setText("Echec");
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
				
				croupier = partie.minCroupier();
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
				boutonPiocher.setEnabled(false);
				boutonPasser.setEnabled(false);
				boutonRecommencer.setEnabled(true);
			}
		});
		
		boutonRecommencer.setText("Rejouer");
		boutonRecommencer.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				labelCroupier.setText("Croupier: ");
				labelJoueur.setText("Joueur ");
				winLoseBox.setText("   ");
				
				croupier = new Joueur();
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
		
		setLayout(new BorderLayout());
		add(top,  BorderLayout.NORTH);
		add(carteCroupierPanel,  BorderLayout.CENTER);
		add(carteJoueurPanel,  BorderLayout.SOUTH);
	}

	public void lancerJeu() {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Blackjack");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(this);
		frame.setPreferredSize(new Dimension(1280, 800));
		
		frame.pack();
		frame.setVisible(true);
	}

}
