/**
 * 
 */
package blackjack;

/**
 * @author Simon
 *
 */

import java.util.*;
import blackjack.Carte.Couleur;
import blackjack.Carte.Rang;

public class Paquet {

	/** Paquet de cartes */
	private Carte[] cartes;
	
	/** Nombre d'itération pour mélanger les cartes */
	private static final int NB_ITERATIONS = 3;
	
	/**
	 * Constructeur
	 */
	public Paquet() {
		// initialisation des cartes du paquet
		this.cartes = new Carte[Rang.values().length * Couleur.values().length];
		for (int i=0; i < Couleur.values().length; i++) 
		{
			for (int j = 0; j < Rang.values().length; j++)
			{
				this.cartes[i * Rang.values().length + j] = new Carte (Rang.values()[j], Couleur.values()[i]);
			}
		}
		// mélange du paquet
		melanger();
	}
	
	
	/** 
	 * Méthode pour mélanger les cartes du paquet
	 */
	private void melanger()
	{
		Random r = new Random();
		for (int i = 0; i < NB_ITERATIONS; i++)
		{
			for (int j = 0; j < this.cartes.length; j++)
			{
				echanger(r.nextInt(this.cartes.length), r.nextInt(this.cartes.length));
			}
		}
	}
	
	/**
	 * Echange deux cartes d'un paquet
	 * @param i L'indice de la première carte à échanger.
	 * @param j L'indice de la seconde carte à échanger.
	 */
	
	private void echanger (int i, int j)
	{
		Carte temp;
		temp = this.cartes[i];
		this.cartes[i] = this.cartes[j];
		this.cartes[j] = temp;
	}
	
	/** 
	 * Renvoie le nombre de cartes disponibles
	 * @return le nombre de cartes disponibles
	 */
	public int getNombreCartes()
	{
		return this.cartes.length;
	}
	
	/**
	 * Renvoie un tableau des cartes
	 * @return un tableau de cartes.
	 */
	public String voirPaquet() {
		String s = "";
		for (int i = 0; i < this.cartes.length; i++)
		{
			s+= cartes[i].toString() + "\n";
		}
		return s;
	}
	
	/**
	 * Renvoie un tableau des cartes piochées
	 * @param n Le nombre de cartes piochées
	 * @return Retourne un tableau de cartes piochées ou null si il n'y a plus assez de cartes dans le paquet
	 */
	public Carte[] piocher(int n)
	{
		if (n <= this.cartes.length)
		{
			Carte[] main = Arrays.copyOfRange(this.cartes, 0, n-1);
			this.cartes = Arrays.copyOfRange(this.cartes, n, this.cartes.length -1);
			
			return main;
		}
		
		return null;
	}


	@Override
	public String toString() {
		return Arrays.toString(cartes);
	}
	
}
