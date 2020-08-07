/**
 * 
 */
package blackjack;

/**
 * @author Simon
 *
 */
public class Joueur {
	
	// ID du joueur
	private int ID;
	
	// Cartes en main
	protected Carte[] main;
	
	// Total des points
	protected int point;
	
	// Boolean pour savoir si le joueur est éliminé
	protected boolean estElimine;
	
	/**
	 * Constructeur
	 * @param carteMain Les cartes que le joueurs à en main.
	 * @param point Le total des point obtenu par les cartes.
	 */
	public Joueur(Carte[] main, int point)
	{
		this.main = main;
		this.point = point;
		this.estElimine = false;
	}
	public Joueur(int ID,int point, boolean estElimine)
	{
		this.main = main;
	}
	
	public int compterPoint()
	{
		point = 0;
		
		
		return point;
	}
	
}
