/**
 * 
 */
package blackjack;

/**
 * @author Simon
 *
 */
public class Joueur {
	
	// Cartes en main
	private Carte[] cartesMain;
	
	// Total des points
	private int point;
	
	// Boolean pour savoir si le joueur est éliminé
	private boolean estElimine;
	
	/**
	 * Constructeur
	 * @param carteMain Les cartes que le joueurs à en main.
	 * @param point Le total des point obtenu par les cartes.
	 */
	public Joueur(Carte[] cartesMain, int point)
	{
		this.cartesMain = cartesMain;
		this.point = point;
		this.estElimine = false;
	}
}
