/**
 * 
 */
package vue;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;

import model.BlackJack;
import model.Joueur;

public class BlackjackGUI extends JPanel {
	
	JPanel top = new JPanel();
	JPanel carteCroupier = new JPanel();
	JPanel carteJoueur = new JPanel();
	
	JTextPane winLoseBox = new JTextPane();
	
	JButton boutonPiocher = new JButton();
	JButton boutonCommencer = new JButton();
	JButton boutonPasser = new JButton();
	JButton boutonRecommencer = new JButton();
	
	JLabel labelCroupier = new JLabel();
	JLabel labelJoueur = new JLabel();
	
	Joueur croupier = new Joueur();
	Joueur joueur = new Joueur();
	BlackJack partie = new BlackJack(croupier,joueur);
	
	JLabel joueurCarte1;
	JLabel joueurCarte2;
	JLabel JoueurCartePioche;
	JLabel croupierCarte0;
	JLabel croupierCarte1;
	JLabel croupierCarte2;
	JLabel croupierCartePioche;
	
	public BlackjackGUI()
	{
		top.setBackground(new Color(0, 122, 0));
		carteCroupier.setBackground(new Color(0, 122, 0));
		carteJoueur.setBackground(new Color(0, 122, 0));
	}
}
