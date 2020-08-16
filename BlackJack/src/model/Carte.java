package model;

import javax.swing.ImageIcon;

public class Carte {
	
	/**
	 * Les 4 éléments de la cartes
	 * La couleur, Le numero, La valeur utilisé pour les points, et l'image utilisé pour la GUI
	 */
	private  String couleur;
	private  String numero;
	private  int valeur;
	private  ImageIcon imgCarte;
	
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
	/**
	 * @return the couleur
	 */
	public String getCouleur() {
		return couleur;
	}
	/**
	 * @param couleur the couleur to set
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}
	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}
	/**
	 * @return the valeur
	 */
	public int getValeur() {
		return valeur;
	}
	/**
	 * @param valeur the valeur to set
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	/**
	 * @return the imgCarte
	 */
	public ImageIcon getImgCarte() {
		return imgCarte;
	}
	/**
	 * @param imgCarte the imgCarte to set
	 */
	public void setImgCarte(ImageIcon imgCarte) {
		this.imgCarte = imgCarte;
	}
	@Override
	public String toString() {
		return "Couleur : " + couleur + " numero: " + numero + " valeur: " + valeur;
	}
	
}