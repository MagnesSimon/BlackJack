/**
 * 
 */
package vue;

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



 
public class EcranAcceuil extends JFrame {
	// Image
	String imgUrl="img/blackjack.jpg";
	ImageIcon icone = new ImageIcon(imgUrl);
	
	Regles ecranRegles = new Regles();
	
	public JButton boutonStart = new JButton("Start Game !");
	
	JButton boutonRegles = new JButton("Règles du blackjack");
	
	
	
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

		JPanel mid = new JPanel();
		mid.add(label);
		
		JPanel top = new JPanel();
		top.add(boutonRegles);

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
		boutonRegles.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ecranRegles.afficherRegles();
			}
		});
	}
	/**
	 * Fermer la fenêtre
	 */
	public void fermerFenetre()
	{
		this.dispose();
		ecranRegles.dispose();
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
	 * @return l'Url de l'image
	 */
	public String getImgUrl() {
		return imgUrl;
	}
	/**
	 * @param imgUrl the imgUrl to set
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
}