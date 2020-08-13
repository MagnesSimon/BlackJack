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
	
	private String str = "Règles du blackjack: \n "
			+ "Le joueur joue contre un croupier, le but est d'obtenir un score supérieur "
			+ "à celui du croupier sans dépasser le score de 21.\n"
			+ "Si le joueur obtiens un score de 21 en deux cartes, il fait un Blackjack et gagne automatiquement.\n"
			+ "Le joueur reçois deux cartes pour démarrer la partie et choisit de piocher ou de se coucher. \n"
			+ "Le chiffre sur la carte équivaut au nombre de point de celle-ci, les figure ont un score de 10.\n"
			+ "L'as vaut 11, et si le score du joueur ou du croupier dépasse 21, l'as vaut 1.\n";
	
	public Regles()
	{
		this.setTitle("Règles du blackjack");
		this.setSize(800,600);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.GRAY);

		
		JLabel textRegle = new JLabel(str);

		
		//textRegle.setText(str);
		//textRegle.setFont(new Font("Helvetica Bold", 1, 20));
		
		container.add(textRegle);
		this.setContentPane(container);
		this.setVisible(true);
	}

	public void getRegles() {
		// TODO Auto-generated method stub
		new Regles();
	}
}
