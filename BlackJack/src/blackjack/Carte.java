/**
 * 
 */
package blackjack;



/**
 * @author Simon
 *
 */
public class Carte {

	/** rang de la carte. */
	public enum Rang {
		AS, DEUX, TROIS, QUATRE, CINQ, SIX, SEPT, HUIT, NEUF, DIX, VALET, DAME, ROI
	}
	
	/** Couleur de la carte */
	public enum Couleur {
		CARREAU, COEUR, PIQUE, TREFLE
	}
	
	/** Le rang de la carte */
	private Rang rang;
	
	/** La couleur de la carte */
	private Couleur couleur;

	/**
	 * Constructeur de la carte
	 * @param rang
	 * @param couleur
	 */
	public Carte(Rang rang, Couleur couleur) {
		this.rang = rang;
		this.couleur = couleur;
	}

	/**
	 * @return the rang
	 */
	public Rang getRang() {
		return rang;
	}

	/**
	 * @param rang the rang to set
	 */
	public void setRang(Rang rang) {
		this.rang = rang;
	}

	/**
	 * @return the couleur
	 */
	public Couleur getCouleur() {
		return couleur;
	}

	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		return this.rang + " de " + this.couleur;
	}
	
}
