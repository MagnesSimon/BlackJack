/**
 * 
 */
package blackjack;

/**
 * @author Simon
 *
 */

import java.awt.BorderLayout;

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
	
	
	// Création de l'écran d'acceuil
	EcranAcceuil acceuil = new EcranAcceuil();
	/**
	 * Construction de l'application
	 */
	public TestJeuDeCartes()
	{
		// Appel du constructeur de la classe JFrame.
		super("JeuDeCartes");
		

		
		
		// Ajout des composants au container
		JTextArea zoneSortie = new JTextArea();
		zoneSortie.setEditable(false);
		getContentPane().add(new JScrollPane(zoneSortie), BorderLayout.CENTER);
		
		//Texte de sortie
		StringBuilder sortie = new StringBuilder();
		

		
		// Construction du paquet de cartes
		Paquet paquet = new Paquet();
		
		// Création du croupier
		Croupier croupier = new Croupier(0, false);
		/*
		// Création des joueurs
		Joueur joueur1 = new Joueur(0, false);
		Joueur joueur2 = new Joueur(0, false);
		Joueur joueur3 = new Joueur(0, false);
		*/
		
		// Création automatique de joueurs
		sortie.append("Combien de joueurs? (2 - 5)\n");
		for (int i = 0; i < getNbJoueurs(); i++ )
		{
			Joueur joueur = new Joueur(i, 0,false);
		}
		sortie.append("Il y a " + getNbJoueurs() + " joueurs! \n");
		/**
		 * pioche des deux première cartes
		 */
		/*
		sortie.append("Le joueur 1 pioche 2 cartes. \n");
		joueur1.main = paquet.piocher(2);
		for (int i = 0; i< joueur1.main.length ; i++)
		{
			sortie.append("- ").append(joueur1.main[i]).append("\n");
		}
		
		sortie.append("Le joueur 2 pioche 2 cartes.\n");
		joueur2.main = paquet.piocher(2);
		for (int i = 0; i< joueur2.main.length ; i++)
		{
			sortie.append("- ").append(joueur2.main[i]).append("\n");
		}
		
		sortie.append("Le joueur 3 pioche 2 cartes.\n");
		joueur3.main = paquet.piocher(2);
		for (int i = 0; i< joueur3.main.length ; i++)
		{
			sortie.append("- ").append(joueur3.main[i]).append("\n");
		}
		
		sortie.append("Le croupier pioche 2 cartes. \n");
		croupier.main = paquet.piocher(2);
		for (int i = 0; i< croupier.main.length ; i++)
		{
			sortie.append("- ").append(croupier.main[i]).append("\n");
		}
		*/
		
		
		// Met à jour la zone de sortie
		zoneSortie.setText(sortie.toString());
		
		// Modifie les propriété de la fenêtre
		setSize(600,200);
		setLocation(100,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public void choisirNbJoueurs()
	{
		setNbJoueurs(acceuil.getNbJoueurs());
		
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
	
	// Methode de début de partie
	public  void startGame()
	{
		new TestJeuDeCartes();
		System.out.println("hi");
	}
	/**
	 * Début de l'exécution du test
	 * @param args Les paramètre de la ligne de commande
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new TestJeuDeCartes();
		EcranAcceuil ecran = new EcranAcceuil();
		
	}

}
