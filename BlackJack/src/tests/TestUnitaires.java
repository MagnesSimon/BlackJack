package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.*;
import vue.BlackjackGUI;

class TestUnitaires {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public final void testWinRate() {
		int a;
		int b;
		double res;
		
		a = 5;
		b = 10;
		res = (int) a / (int) b;
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
		
		a = -5;
		b = 10;
		res = (int) a / (int) b;
		if(Stats.winRate(a, b) != res)
		{
			fail("Erreur division négatifs");
		}
	}
	
	public final void testMaxVicCons() {
		int a;
		
		 a = 5;
		 if( Stats.maxVicCons(a) <= BlackjackGUI.getNbWin())
		 {
			 fail("Erreur comparaison");
		 }
	}
}
