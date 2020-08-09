/**
 * 
 */
package vue;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	JLabel JoueurCartePioche;
	JLabel croupierCarte0;
	JLabel croupierCarte1;
	JLabel croupierCarte2;
	JLabel croupierCartePioche;
	
	public BlackjackGUI()
	{
		top.setBackground(Color.GREEN);
		carteCroupier.setBackground(Color.GREEN);
		carteJoueur.setBackground(Color.GREEN);
		
		top.setLayout(new FlowLayout());
		winLoseBox.setText(" ");
		winLoseBox.setFont(new Font("Helvetica Bold", 1, 20));
		
		boutonDemarrer.setText(" Commencer ");
		boutonDemarrer.addActionListener(new ActionListener()
				{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				carteCroupier.add(labelCroupier);
			}
		});
	}

}
