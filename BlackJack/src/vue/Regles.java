/**
 * 
 */
package vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 * @author Simon
 *
 */
public class Regles extends JFrame {
	
	private JPanel container = new JPanel();
	
	private String str = "<html><b>Règles du blackjack: </b><br/> "
			+ "Le joueur joue contre un croupier, le but est d'obtenir un score supérieur "
			+ "à celui du croupier sans dépasser le score de 21.<br/>"
			+ "Si le joueur obtiens un score de 21 en deux cartes, il fait un Blackjack et gagne automatiquement.<br/>"
			+ "Le joueur reçois deux cartes pour démarrer la partie et choisit de piocher ou de se coucher. <br/>"
			+ "Le chiffre sur la carte équivaut au nombre de point de celle-ci, les figure ont un score de 10.<br/>"
			+ "L'as vaut 11, et si le score du joueur ou du croupier dépasse 21, l'as vaut 1.</html>";
	
	private  JLabel textRegle = new JLabel(str);
	
	public Regles()
	{
		this.setTitle("Règles du blackjack");
		this.setSize(800,200);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.GRAY);	
	}
	
	/*
	 * Affiche la fenêtre des regles
	 */
	public void afficherRegles() {
		container.add(textRegle);
		this.setContentPane(container);
		this.setVisible(true);
	}
	
	/*
	 * Ferme la fenêtre
	 */
	public  void fermerFenetre() {
		// TODO Auto-generated method stub
		this.dispose();
	}
}
