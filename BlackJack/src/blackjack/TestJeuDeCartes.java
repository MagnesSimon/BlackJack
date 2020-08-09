/**
 * 
 */
package blackjack;

/**
 * @author Simon
 *
 */

import java.awt.BorderLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class TestJeuDeCartes extends JFrame {

	/**
	 * Serial version UID
	 */
	private static final long serialVersionUID =1L;
	
	// Nombre de joueurs
	private int nbJoueurs;
	
	// Array des joueurs
	//private ArrayList listeJoueurs;
	
	// Sortie 
	StringBuilder sortie = new StringBuilder();
	JTextArea zoneSortie = new JTextArea();
	
	// Création de la liste de joueurs
	LinkedList listeJoueurs = new LinkedList();
	
	// JPanel
	JPanel zoneCarte = new JPanel();
	
	/**
	 * Construction de l'application
	 */
	public TestJeuDeCartes()
	{
		// Appel du constructeur de la classe JFrame.
		super("JeuDeCartes");
	}

	public void startGame(int nb)
	{
		
		// Ajout des composants au container
		zoneSortie.setEditable(false);
		getContentPane().add(new JScrollPane(zoneSortie), BorderLayout.CENTER);
			
		// Met à jour la zone de sortie
		zoneSortie.setText(sortie.toString());
		
		// Modifie les propriété de la fenêtre
		setSize(1920,1080);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String imgUrl="img/cartes/1-coeur.jpg";
		ImageIcon icone = new ImageIcon(imgUrl);
		
		JLabel img = new JLabel(icone, JLabel.CENTER);
		
		JPanel mid = new JPanel();
		mid.add(img);
		zoneCarte.add(mid, BorderLayout.CENTER);
		
		

		/*
		setNbJoueurs(nb);	
		sortie.append("Il y a " + nb + " joueurs! \n");
		for (int i = 0; i < nb; i++ )
		{
		
			joueur.setMain(paquet.piocher(2));
			sortie.append("\n Joueur: " + joueur.getIDAdd()  + " voici vos cartes \n");
			for (int j = 0; j< joueur.getMain().length ; j++)
			{
				sortie.append("- ").append( joueur.getMain()[j]).append("\n");
			}
		}
		
		croupier.setMain(paquet.piocher(2));
		sortie.append("Le croupier a les cartes suivantes : ");
		for (int j = 0; j< croupier.getMain().length ; j++)
		{
			sortie.append("- ").append( croupier.getMain()[j]).append("\n");
		}
		
		// mise à jour de la zone de sortie
		zoneSortie.setText(sortie.toString());
		
*/
	}
	/**
	 * Creer le nombre de joueurs voulu ansi que le croupier
	 * @param nb Le nombre de joueurs
	 * @param ecran L'ecran d'acceuil sur lequel on clique pour savoir le nombre de joueurs
	 */
	public void creerJoueurs(int nb, EcranAcceuil ecran) {
		// Création du croupier
		Croupier croupier = new Croupier(0, false);
		listeJoueurs.add(croupier);
		
		nb = ecran.getNbJoueurs();
		for (int i = 0; i < ecran.getNbJoueurs(); i++)
		{
			Joueur joueur = new  Joueur(0, 0,false);
			int j = i+1;
			joueur.setID(j);
			listeJoueurs.add(joueur);
		}
	}
	
	/**
	 * Afficher les cartes du joueurs
	 * @param id L'id du joueurs dont on veux afficher les cartes.
	 */
	public void afficher(int pos, Joueur joueur)
	{
		if ( pos == 0)
		{
			sortie.append("\n Le Croupier possède les cartes suivantes: \n");
			for (int j = 0; j< getCroupier().getMain().length ; j++)
			{
			sortie.append("- ").append( getCroupier().getMain()[j]).append("\n");
			}
		}
		else
		{
			sortie.append("\n Le joueur " + getIdJoueurs(pos) + " possede les cartes suivantes: \n");
			for (int j = 0; j< getJoueurs(pos).getMain().length ; j++)
			{
				sortie.append("- ").append( getJoueurs(pos).getMain()[j]).append("\n");
			}
		}
		// Met à jour la zone de sortie
		zoneSortie.setText(sortie.toString());
	}
	public void compterScore(int id)
	{
		int score = 0;
		for (int i =0; i < getJoueurs(id).getMain().length; i++)
		{
			switch ( getJoueurs(id).getMain()[i].toString()) {
			
			// LES AS
			case "AS de COEUR":
				score += 11;
				break;	
			case "AS de CARREAU":
				score += 11;
				break;
			case "AS de PIQUE":
				score += 11;
				break;
			case "AS de TREFLE":
				score += 11;
				break;
			
				// LES DEUX
			case "DEUX de COEUR":
				score += 2;
				break;
			case "DEUX de CARREAU":
				score += 2;
				break;
			case "DEUX de PIQUE":
				score += 2;
				break;
			case "DEUX de TREFLE":
				score += 2;
				break;
				
			// LES TROIS
			case "TROIS de COEUR":
				score += 3;
				break;	
			case "TROIS de CARREAU":
				score += 3;
				break;
			case "TROIS de PIQUE":
				score += 3;
				break;
			case "TROIS de TREFLE":
				score += 3;
				break;
			
			// LES QUATRES
			case "QUATRE de COEUR":
				score += 4;
				break;
			case "QUATRE de CARREAU":
				score += 4;
				break;
			case "QUATRE de PIQUE":
				score += 4;
				break;
			case "QUATRE de TREFLE":
				score += 4;
				break;
			// LES CINQ
			case "CINQ de COEUR":
				score += 5;
				break;	
			case "CINQ de CARREAU":
				score += 5;
				break;
			case "CINQ de PIQUE":
				score += 5;
				break;
			case "CINQ de TREFLE":
				score += 5;
				break;
				
			// LES SIX
			case "SIX de COEUR":
				score += 6;
				break;
			case "SIX de CARREAU":
				score += 6;
				break;
			case "SIX de PIQUE":
				score += 6;
				break;
			case "SIX de TREFLE":
				score += 6;
				break;
					
			// LES SEPT
			case "SEPT de COEUR":
				score += 7;
				break;	
			case "SEPT de CARREAU":
				score += 7;
				break;
			case "SEPT de PIQUE":
				score += 7;
				break;
			case "SEPT de TREFLE":
				score += 7;
				break;
			
			// LES HUIT
			case "HUIT de COEUR":
				score += 8;
				break;
			case "HUIT de CARREAU":
				score += 8;
				break;
			case "HUIT de PIQUE":
				score += 8;
				break;
			case "HUIT de TREFLE":
				score += 8;
				break;
				
			// LES NEUF
			case "NEUF de COEUR":
				score += 9;
				break;	
			case "NEUF de CARREAU":
				score += 9;
				break;
			case "NEUF de PIQUE":
				score += 9;
				break;
			case "NEUF de TREFLE":
				score += 9;
				break;
				
			// LES DIX
			case "DIX de COEUR":
				score += 10;
				break;
			case "DIX de CARREAU":
				score += 10;
				break;
			case "DIX de PIQUE":
				score += 10;
				break;
			case "DIX de TREFLE":
				score += 10;
				break;
				
			// LES VALETS
			case "VALET de COEUR":
				score += 10;
				break;	
			case "VALET de CARREAU":
				score += 10;
				break;
			case "VALET de PIQUE":
				score += 10;
				break;
			case "VALET de TREFLE":
				score += 10;
				break;
			
			// LES DAMES
			case "DAME de COEUR":
				score += 10;
				break;
			case "DAME de CARREAU":
				score += 10;
				break;
			case "DAME de PIQUE":
				score += 10;
				break;
			case "DAME de TREFLE":
				score += 10;
				break;
				
			// LES ROI
			case "ROI de COEUR":
				score += 10;
				break;	
			case "ROI de CARREAU":
				score += 10;
				break;
			case "ROI de PIQUE":
				score += 10;
				break;
			case "ROI de TREFLE":
				score += 10;
				break;
			}
		}
		sortie.append("Score : "+ score + "\n");
		zoneSortie.setText(sortie.toString());
	}
	/**
	 * @return the nbJoueurs
	 */
	public int getNbJoueurs() {
		return nbJoueurs;
	}

	/**
	 * @param nbJoueurs the nbJoueurs to set
	 */
	public void setNbJoueurs(int nbJoueurs) {
		this.nbJoueurs = nbJoueurs;
	}
	
	/**
	 * @param i Le joueurs voulu
	 * @return le joueurs entré en parametre
	 */
	public Joueur getJoueurs(int i) {
		return (Joueur) listeJoueurs.get(i);
	}
	/**
	 * @return le croupier
	 */
	public Joueur getCroupier() {
		return (Joueur) listeJoueurs.get(0);
	}
	/**
	 * Donne l'ID du joueur voulu
	 * @param i Position du joueur dans la linkedList
	 * @return L'id du joueur.
	 */
	public int getIdJoueurs(int i){
		Joueur j ;
		int id;
		j = (Joueur) listeJoueurs.get(i);
		id = j.getID();		
		return id;
	}


	/**
	 * @param listeJoueurs the listeJoueurs to set
	 */
	public void setListeJoueurs(LinkedList listeJoueurs) {
		this.listeJoueurs = listeJoueurs;
	}

	/**
	 * Début de l'exécution du test
	 * @param args Les paramètre de la ligne de commande
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new TestJeuDeCartes();
		EcranAcceuil ecran = new EcranAcceuil();
		
		// Création de la partie
		TestJeuDeCartes jeu = new TestJeuDeCartes();

		// Creation du paquet
		Paquet paquet = new Paquet();
		

		ecran.boutonStart.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ecran.fermerFenetre();
				jeu.creerJoueurs(ecran.getNbJoueurs(), ecran);
				jeu.startGame(ecran.getNbJoueurs());
				
				// Le croupier pioche
				jeu.getCroupier().setMain(paquet.piocher(2));
				
				// Les joueurs pioche
				for (int i = 0; i < ecran.getNbJoueurs(); i++)
				{
					jeu.getJoueurs(i).setMain(paquet.piocher(2));
				}
				
				// Affiche les cartes des joueurs
				for (int i =0 ; i < ecran.getNbJoueurs(); i++)
				{
					jeu.afficher(i, jeu.getJoueurs(i));
					jeu.compterScore(i);
				}
				
				
				
			}
		});
	}
}
	


