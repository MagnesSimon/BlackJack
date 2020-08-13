/**
 * 
 */
package model;

import vue.*;

/**
 * @author Simon
 *
 */
public interface Stats {
	
	/**
	 * Calcule le taux de victoire
	 * @param nbWin le nombre de partie gagnée
	 * @param nbGame le nombre de partie jouées
	 * @return le taux de victoire
	 */
	public static double winRate(int nbWin, int nbGame) {
		double result ;
		result = (double) (int)nbWin / (int)nbGame;
		result = result*100;
		
		double d = (double) Math.round(result * 100) / 100; // 4.248 --> 4.25

		return d;
	}
	
	/**
	 * Methode qui donne les victoires consécutives du joueur
	 * @param s l'état de la partie.
	 * @return le nombre de victoire consécutives
	 */

	public static int vicCons(String s) {
		int result;
		
		if(s == "Victoire !"   )
		{
			BlackjackGUI.setVicCons(BlackjackGUI.getVicCons() +1);
			
			result = BlackjackGUI.getVicCons();
		}
		else 
		{
			BlackjackGUI.setVicCons(0);
			result = BlackjackGUI.getVicCons();
		}
		return result;
	}
	
	/**
	 * Methode pour obtenir le nombre de victoire consécutives  
	 * @param cons Le nombre de victoire consécutives actuelle
	 * @return Le max de victoire consecutives
	 */
	public static int maxVicCons( int cons) {
		int result = BlackjackGUI.getMaxVicCons();
		
		if(cons > result)
		{
			result = cons;
			BlackjackGUI.setMaxVicCons(cons);
		}
		return result;
	}
}
