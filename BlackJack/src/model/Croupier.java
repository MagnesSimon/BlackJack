package model;

import controleur.Partie;

public class  Croupier extends Joueur {
	
	private int nbDefaitesConsecutives;
	
	public Croupier() {
		super();
		nbDefaitesConsecutives = 0;
	}

	/**
	 * @return the nbDefaitesConsecutives
	 */
	public int getNbDefaitesConsecutives() {
		return nbDefaitesConsecutives;
	}

	/**
	 * @param nbDefaitesConsecutives the nbDefaitesConsecutives to set
	 */
	public void setNbDefaitesConsecutives(int n) {
		nbDefaitesConsecutives = n;
	}
	

}
