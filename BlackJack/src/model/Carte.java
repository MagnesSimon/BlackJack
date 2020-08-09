package model;

import javax.swing.ImageIcon;

public class Carte {
	
	/**
	 * Les 4 éléments de la cartes
	 * La couleur, Le numero, La valeur utilisé pour les points, et l'image utilisé pour la GUI
	 */
	protected String couleur;
	protected String numero;
	protected int valeur;
	protected ImageIcon imgCarte;
	
	/**
	 * Constructeur de base
	 */
	public Carte()
	{
		couleur = null;
		numero = null;
		valeur = 0;
		imgCarte = null;
	}
	/**
	 * Constructeur avec paramètres
	 * @param c La couleur de la carte
	 * @param n Le numero de la carte (As à Roi)
	 * @param v La valeur en point de la carte
	 * @param i L'image utilisé par la GUI
	 */
	public Carte( String c, String n, int v, ImageIcon i)
	{
		couleur = c;
		numero = n;
		valeur = v;
		imgCarte = i;
	}
	
}