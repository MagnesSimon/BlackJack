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

	// Bouton
	JButton bouton2 = new JButton("2 Joueurs.");
	JButton bouton3 = new JButton("3 Joueurs.");
	JButton bouton4 = new JButton("4 Joueurs.");
	JButton bouton5 = new JButton("5 Joueurs.");
	
	
	private JPanel container = new JPanel();
	private JLabel label = new JLabel(icone, JLabel.CENTER);

	public EcranAcceuil(){
		this.setTitle("BlackJack");
		this.setSize(1080, 1920);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());

		JPanel top = new JPanel();
		top.add(label);
		
		JPanel bottom = new JPanel();
		bottom.add(bouton2);
		bottom.add(bouton3);
		bottom.add(bouton4);
		bottom.add(bouton5);
		
		container.add(top, BorderLayout.CENTER);
		container.add(bottom, BorderLayout.NORTH);
		this.setContentPane(container);
		this.setVisible(true);            
	}
}