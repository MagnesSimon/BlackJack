package model;

import java.util.Iterator;

import controleur.*;
import vue.BlackjackGUI;


public class BlackJack {
	
	private Joueur croupier;
	private Joueur joueur;
	private Paquet paquet;
	private String resultat;
	
	/**
	 * Constructeurs
	 * @param crp Le croupier
	 * @param player Le joueur
	 */
	public BlackJack ( Croupier crp, Joueur player)
	{
		croupier = crp;
		joueur = player;
		paquet = new Paquet();
		
	}
	
	/**
	 * Methode qui distribue deux carte au joueur et au croupier
	 */
	public void initialisationPartie() {
		//Cartes du croupier
		croupier.prendreCarte(paquet);
		croupier.prendreCarte(paquet);
		// Cartes du joueur
		joueur.prendreCarte(paquet);
		joueur.prendreCarte(paquet);
	}
	
	/**
	 * Methode pour piocher une carte
	 * @param j le joueur qui pioche
	 * @return la carte piocher
	 */
	public Carte piocher(Joueur j)
	{
		Carte result = j.prendreCarte(paquet);
		
		return result;
	}
	
	/**
	 * permet d'obtenir la valeur des cartes en main
	 * @param j le joueur
	 * @return la valeur des cartes en main
	 */
	public int valeurMain(Joueur j) {
		int result = j.getValeurMain();
		
		return result;
	}
	 /**
	  * Retire une carte de la main du joueur
	  * @param j le joueur a qui on retire la carte
	  * @param c la carte retirée
	  */
	public void retirer (Joueur j, Carte c) throws ElementNotFoundException
	{
		Carte carte = null;
		boolean existe = false;
		Iterator<Carte> scan = j.iterator();
		
		while(scan.hasNext() && !existe)
		{
			carte = scan.next();
			
			if(c.equals(carte))
			{
				j.remove(carte);
				existe = true;
			}
		}
		if(!existe)
	        throw new ElementNotFoundException("BlackJack");
	}
	
	/**
	 * Permet de savoir si le joueur a fait un score de 21
	 * @return le score de 21
	 */
	public boolean blackj()
	{
		boolean result = false;
		
		if(joueur.getValeurMain() == 21)
		{
			BlackjackGUI.setNbWin(BlackjackGUI.getNbWin()+1);
			result = true;
		}

		return result;
	}
	
	/**
	 * Permet de savoir si le joueur a depasser 21
	 * @param j le joueur
	 * @return le score du joueur
	 */
	public boolean echec(Joueur j)
	{
		boolean result = false;
		
		if(j.getValeurMain() > 21)
		{
			result = true;
		}
		
		return result;
	}
	
	/**
	 * Le croupier joue tant qu'il n'a pas au moin un score de 18
	 * @return le score du croupier
	 */
	public Joueur minCroupier() {
		Joueur result = croupier;
		
		while(croupier.getValeurMain() < 17)
		{
			croupier.prendreCarte(paquet);
		}
		return result;
	}
	
	/**
	 * Permet de savoir qui gagne
	 * @return Un string annonçant la victoire ou la défaite.
	 */
	public String fin()
	{
		String result = "";
		if((joueur.getValeurMain()>21) || 
				((joueur.getValeurMain() < croupier.getValeurMain()) && croupier.getValeurMain() <= 21))
		{
			resultat = "Perdu !";
			result = "Perdu !";
		}
		else if((joueur.getValeurMain() == croupier.getValeurMain()) && croupier.getValeurMain() <= 21)
		{
			resultat = "Egalité !";
			result = "Egalité !";
		}
		else
		{
			resultat = "Victoire !";
			result = "Victoire !";
			BlackjackGUI.setNbWin(BlackjackGUI.getNbWin()+1);
		}		
		return result;
	}

	/**
	 * @return the croupier
	 */
	public Joueur getCroupier() {
		return croupier;
	}

	/**
	 * @param croupier the croupier to set
	 */
	public void setCroupier(Joueur croupier) {
		this.croupier = croupier;
	}

	/**
	 * @return the joueur
	 */
	public Joueur getJoueur() {
		return joueur;
	}

	/**
	 * @param joueur the joueur to set
	 */
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	/**
	 * @return the paquet
	 */
	public Paquet getPaquet() {
		return paquet;
	}

	/**
	 * @param paquet the paquet to set
	 */
	public void setPaquet(Paquet paquet) {
		this.paquet = paquet;
	}

	/**
	 * @return the resultat
	 */
	public String getResultat() {
		return resultat;
	}

	/**
	 * @param resultat the resultat to set
	 */
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	
}