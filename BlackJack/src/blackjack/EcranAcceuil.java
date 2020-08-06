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

 
public class EcranAcceuil extends JFrame {
	 /**
     * Ajout de l'image
     */
    String imgUrl="img/blackjack.jpg";
    ImageIcon icone = new ImageIcon(imgUrl);
	
  private JPanel container = new JPanel();
 
  private JLabel label = new JLabel(icone, JLabel.CENTER);

  public EcranAcceuil(){
    this.setTitle("Animation");
    this.setSize(1080, 1920);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    container.setBackground(Color.white);
    container.setLayout(new BorderLayout());
    
    
  

    JPanel top = new JPanel();
    top.add(label);

    container.add(top, BorderLayout.CENTER);
    this.setContentPane(container);
    this.setVisible(true);            
  }
}