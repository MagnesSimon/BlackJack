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

import javax.swing.JFrame;
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
	
	// Création du croupier
	Croupier croupier = new Croupier(0, false);
	
	
	/**
	 * Construction de l'application
	 */
	public TestJeuDeCartes()
	{
		// Appel du constructeur de la classe JFrame.
		super("JeuDeCartes");
	}

	/**
	 * Création automatique de joueurs
	 */
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
	 * Creer le nombre de joueurs voulu
	 * @param nb Le nombre de joueurs
	 * @param ecran L'ecran d'acceuil sur lequel on clique pour savoir le nombre de joueurs
	 */
	public void creerJoueurs(int nb, EcranAcceuil ecran) {
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
		sortie.append("\n Le joueur " + getIdJoueurs(pos) + " possede les cartes suivantes: \n");
		for (int j = 0; j< getJoueurs(pos).getMain().length ; j++)
		{
		sortie.append("- ").append( getJoueurs(pos).getMain()[j]).append("\n");
		}
		// Met à jour la zone de sortie
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
	 * 
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
				
				for (int i = 0; i < ecran.getNbJoueurs(); i++)
				{
					jeu.getJoueurs(i).setMain(paquet.piocher(2));
				}
				
				//jeu.afficher(1, jeu.getJoueurs(1));
				for (int i =0 ; i < ecran.getNbJoueurs(); i++)
				{
					jeu.afficher(i, jeu.getJoueurs(i));
				}

			}
		});
		

	/*	
		for (int i = 0; i < ecran.getNbJoueurs(); i++)
		{
			Joueur joueur = new Joueur(i, 0,false);
			joueur.setID(i);
			joueur.setMain(paquet.piocher(2));
			jeu.afficher(i, joueur);
		}
	*/	
		
		
		// Fin du main
	}

}
