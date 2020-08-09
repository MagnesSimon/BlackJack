package model;


import java.util.*;

public class Joueur{
	
	protected ArrayList<Carte> main;
	protected int valeurMain;
	protected int point;
	
	public Joueur() {
		main = new ArrayList<Carte>(12);
		valeurMain = 0;
		point = 0;
	}
}