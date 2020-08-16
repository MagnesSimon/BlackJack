package model;


import java.util.*;

public class Joueur{
	
	private  ArrayList<Carte> main;
	private  int valeurMain;
	private  int compte;
	
	/*
	 * Constructeur
	 */
	public Joueur() {
		main = new ArrayList<Carte>(12);
		valeurMain = 0;
		compte = 0;
	}
	
	/**
	 * Si la carte est un as et que le total de point dépasse 21, la valeur de l'as passe à 1 au lieu de 11
	 * @param carte
	 */
	public void reduireMain( Carte carte)
	{
		if (valeurMain > 21)
		{
			if (asEnMain())
			{
				valeurMain -= 10;
			}
		}
	}

	/**
	 * Methode qui permet de savoir si on possède un as
	 * @return un boolean qui indique si le joueur a un as ou non
	 */
	public boolean asEnMain() {
		// TODO Auto-generated method stub
		boolean result = false;
		Carte carte = null;
		Iterator<Carte> scan = main.iterator();
		
		while (scan.hasNext() && !result)
		{
			carte = scan.next();
			if( carte.getValeur() == 11)
			{
				carte.setValeur(1);
				result = true;
			}
			else
			{
				result = false;
			}
		}
		return result;
	}
	
	public Carte prendreCarte(Paquet paquet)
	{
		Carte result;
		result = paquet.prendre();
		main.add(result);
		valeurMain += result.getValeur();
		reduireMain(result);
		compte ++;
		
		return result;
	}
	
	public Iterator<Carte> iterator(){
		return main.iterator();
	}
	
	/**
	 * enleve la carte voulue
	 * @param carte qu on veut retirer
	 * @return la carte retirée
	 */
	public boolean remove(Carte carte) {
		return (main.remove(carte));
	}

	/**
	 * @return the main
	 */
	public ArrayList<Carte> getMain() {
		return main;
	}

	/**
	 * @param main the main to set
	 */
	public void setMain(ArrayList<Carte> main) {
		this.main = main;
	}

	/**
	 * @return the valeurMain
	 */
	public int getValeurMain() {
		return valeurMain;
	}

	/**
	 * @param valeurMain the valeurMain to set
	 */
	public void setValeurMain(int valeurMain) {
		this.valeurMain = valeurMain;
	}

	/**
	 * @return the compte
	 */
	public int getCompte() {
		return compte;
	}

	/**
	 * @param compte the compte to set
	 */
	public void setCompte(int compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Joueur [" + (main != null ? "main=" + main + ", " : "") + "valeurMain=" + valeurMain + ", compte="
				+ compte + "]";
	}
	
	
}