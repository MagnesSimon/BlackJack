
package controleur;

/**
 * @author Simon
 *
 */
public class ElementNotFoundException  extends RuntimeException{
	
	public ElementNotFoundException(String collection)
	{
		super("L'élément voulu n'est pas dans " + collection);
	}

}
