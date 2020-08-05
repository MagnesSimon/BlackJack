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
		
		// Affiche le jeu de cartes complet
		sortie.append("Liste des cartes mélangées. \n\n");
		String listeMelange = paquet.voirPaquet();
		sortie.append(listeMelange);
		
		// Pioche 5 cartes
		sortie.append("Pioche 5 cartes : \n");
		Carte[] main = paquet.piocher(5);
		if (main != null)
		{
			for (int i = 0; i < main.length; i++)
			{
				sortie.append("- ").append(main[i]).append("\n");
			}
		}
		else
		{
			sortie.append("Le nombre de cartes dans le paquet est insuffisant! \n");
		}
		
		// Essai de piocher 50 cartes
		sortie.append("Pioche 50 cartes : \n");
		Carte[] main1 = paquet.piocher(50);
		if (main1 != null)
		{
			for (int i = 0; i < main1.length; i++)
			{
				sortie.append("- ").append(main1[i]).append("\n");
			}
		}
		else
		{
			sortie.append("Le nombre de cartes dans le paquet est insuffisant! \n");
		}
		
		// Nombre de cartes
		int nbCartes = paquet.getNombreCartes();
		sortie.append("Nombre de cartes restante dans le paquets : ");
		sortie.append(nbCartes);
		
		// Met à jour la zone de sortie
		zoneSortie.setText(sortie.toString());
		
		// Modifie les propriété de la fenêtre
		setSize(600,200);
		setLocation(100,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/**
	 * Début de l'exécution du test
	 * @param args Les paramètre de la ligne de commande
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestJeuDeCartes();
	}

}
