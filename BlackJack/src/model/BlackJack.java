package model;


public class BlackJack {
	
	Joueur croupier;
	Joueur joueur;
	Paquet paquet;
	
	public BlackJack ( Joueur crp, Joueur player)
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
}