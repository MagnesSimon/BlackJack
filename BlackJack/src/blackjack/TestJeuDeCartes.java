/**
 * 
 */
package blackjack;

/**
 * @author Simon
 *
 */

import java.awt.BorderLayout;
import java.util.ArrayList;

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
	
	// Creation du paquet
	Paquet paquet = new Paquet();
	/**
	 * Construction de l'application
	 */
	public TestJeuDeCartes()
	{
		// Appel du constructeur de la classe JFrame.
		super("JeuDeCartes");
		
		// Ajout des composants au container
		zoneSortie.setEditable(false);
		getContentPane().add(new JScrollPane(zoneSortie), BorderLayout.CENTER);
				
		// Création du croupier
		Croupier croupier = new Croupier(0, false);
			
		// Met à jour la zone de sortie
		zoneSortie.setText(sortie.toString());
		
		// Modifie les propriété de la fenêtre
		setSize(1920,1080);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * Création automatique de joueurs
	 */
	public void choisirNbJoueurs(int nb)
	{
		setNbJoueurs(nb);	
		sortie.append("Il y a " + nb + " joueurs! \n");
		for (int i = 0; i < nb; i++ )
		{
			Joueur joueur = new Joueur(i, 0,false);
			joueur.setID(i);
			
			joueur.setMain(paquet.piocher(2));
			sortie.append("\n Joueur: " + joueur.getIDAdd()  + " voici vos cartes \n");
			for (int j = 0; j< joueur.getMain().length ; j++)
			{
				sortie.append("- ").append( joueur.getMain()[j]).append("\n");
			}
		}
		
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
	 * Début de l'exécution du test
	 * @param args Les paramètre de la ligne de commande
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new TestJeuDeCartes();
		EcranAcceuil ecran = new EcranAcceuil();
		
	}

}
