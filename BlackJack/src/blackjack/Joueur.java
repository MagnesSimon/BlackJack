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
	/**
	 * distribution des cartes
	 * @param n Le nombre de cartes à distribuer
	 * @param id L'ID du joueur à qui on doit distribuer
	 */
	public void distribuer(int n, int id)
	{
		if ( id == this.getID())
		{
			
		}
	}
	
	
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @return the iD+1
	 */
	public int getIDAdd() {
		return ID+1;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @return the main
	 */
	public Carte[] getMain() {
		return main;
	}
	/**
	 * @param main the main to set
	 */
	public void setMain(Carte[] main) {
		this.main = main;
	}
	/**
	 * @return the point
	 */
	public int getPoint() {
		return point;
	}
	/**
	 * @param point the point to set
	 */
	public void setPoint(int point) {
		this.point = point;
	}
	/**
	 * @return the estElimine
	 */
	public boolean isEstElimine() {
		return estElimine;
	}
	/**
	 * @param estElimine the estElimine to set
	 */
	public void setEstElimine(boolean estElimine) {
		this.estElimine = estElimine;
	}
	
}
