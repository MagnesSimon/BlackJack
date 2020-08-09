package model;


import java.util.*;

public class Joueur{
	
	protected ArrayList<Carte> main;
	protected int valeurMain;
	protected int point;
	
	/*
	 * Constructeur
	 */
	public Joueur() {
		main = new ArrayList<Carte>(12);
		valeurMain = 0;
		point = 0;
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
	private boolean asEnMain() {
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
}