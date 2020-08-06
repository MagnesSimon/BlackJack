/**
 * 
 */
package blackjack;



/**
 * @author Simon
 *
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import blackjack.TestJeuDeCartes;

 
public class EcranAcceuil extends JFrame {
	// Image
	String imgUrl="img/blackjack.jpg";
	ImageIcon icone = new ImageIcon(imgUrl);

	// Bouton
	JButton bouton2 = new JButton("2 Joueurs.");
	JButton bouton3 = new JButton("3 Joueurs.");
	JButton bouton4 = new JButton("4 Joueurs.");
	JButton bouton5 = new JButton("5 Joueurs.");
	
	JButton boutonStart = new JButton("Start Game !");
	
	
	
	private JPanel container = new JPanel();
	private JLabel label = new JLabel(icone, JLabel.CENTER);
	
	// Nombre de joueur
	private int nbJoueurs = 0;

	public EcranAcceuil(){
		this.setTitle("BlackJack");
		this.setSize(1024,758);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());

		// JPannel de l'image
		JPanel mid = new JPanel();
		mid.add(label);
		
		// JPannel des bouton pour le nombre de joueur
		JPanel top = new JPanel();
		top.add(bouton2);
		top.add(bouton3);
		top.add(bouton4);
		top.add(bouton5);
		
		// JPannel pour le bouton Start
		JPanel bot = new JPanel();
		bot.add(boutonStart);
		
		
		container.add(mid, BorderLayout.CENTER);
		container.add(top, BorderLayout.NORTH);
		container.add(bot, BorderLayout.SOUTH);
		this.setContentPane(container);
		this.setVisible(true); 
		
		/**
		 * Definition de l'action des bouton
		 */
		bouton2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setNbJoueurs(2);
				
				System.out.println("2 joueurs");
			}
		});
		bouton3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setNbJoueurs(3);
				System.out.println("3 joueurs");
			}
		});
		bouton4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setNbJoueurs(4);
				System.out.println("4 joueurs");
			}
		});
		bouton5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setNbJoueurs(5);
				System.out.println("5 joueurs");
			}
		});
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
	
}