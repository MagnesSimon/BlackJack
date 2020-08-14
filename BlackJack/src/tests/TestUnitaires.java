package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.*;
import vue.BlackjackGUI;

class TestUnitaires {

	/*
	@Test
	void test() {
		fail("Not yet implemented");
	}
	*/
	
	/**
	 * Permet de tester le winrate de la partie
	 */
	@Test 
	public final void testWinRate() {
		int a;
		int b;
		double res;
		
		a = 5;
		b = 10;
		res = (double) (int) a / (int) b;
		res *= 100;
		if(Stats.winRate(a, b) != res)
		{
			fail("Erreur division entier");
		}
		
		a = 0;
		b = 10;
		res = (int) a / (int) b;
		if(Stats.winRate(a, b) != res)
		{
			fail("Erreur division de 0");
		}
		
		/*
		a = -5;
		b = 10;
		res = (int) a / (int) b;
		if(Stats.winRate(a, b) != res)
		{
			fail("Erreur division négatifs");
		}
		*/
	}
	
	/**
	 * Permet de tester la comparaison pour la méthode de victoire consecutives max
	 */
	@Test
	public final void testMaxVicCons() {
		int a;
		
		 a = 5;
		 if( Stats.maxVicCons(a) <= BlackjackGUI.getNbWin())
		 {
			 fail("Erreur comparaison");
		 }
	}
	
	/*
	 * Permet de tester la pioche d'une carte
	 */
	@Test
	public final void testPioche() {
		Joueur j = new Joueur();
		Croupier c = new Croupier();
		
		BlackJack jeu = new BlackJack(c,j);
		
		if(jeu.piocher(j) == null)
		{
		fail("Erreur pioche");	
		}
	}
	
	/**
	 * Permet de tester que la valeur des cartes en main soit comprise entre 1 et 21
	 */
	@Test
	public final void testValeurMain() {
		Joueur j = new Joueur();
		Croupier c = new Croupier();
		
		BlackJack jeu = new BlackJack(c,j);
		
		int res = jeu.valeurMain(j);
		
		if(res < 1 && res > 11)
		{
			fail("Valeur main invalide");
		}
	}
	
	public final void testBlackj() {
		boolean res;
		Joueur j = new Joueur();
		Croupier c = new Croupier();
		
		BlackJack jeu = new BlackJack(c,j);
		
		j.setValeurMain(21);
		res = jeu.blackj();
		if(res == false)
		{
			fail("Erreur pas de blackjack");
		}
		
		j.setValeurMain(20);
		res = jeu.blackj();
		if(res == true)
		{
			fail("Erreur blackjack invalide (<21)");
		}
		
		j.setValeurMain(22);
		res = jeu.blackj();
		if(res == true)
		{
			fail("Erreur blackjack invalide (>21)");
		}
	}
	
	@Test
	public final void testEchec()
	{
		boolean res;
		Joueur j = new Joueur();
		Croupier c = new Croupier();
		
		BlackJack jeu = new BlackJack(c,j);
		
		j.setValeurMain(22);
		res = jeu.echec(j);
		if (res == false)
		{
			fail("Erreur pas d'Echec");
		}
		
		j.setValeurMain(21);
		res = jeu.echec(j);
		if (res == true)
		{
			fail("Erreurechec invalide");
		}
	}
}
