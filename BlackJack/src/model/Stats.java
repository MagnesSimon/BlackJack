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

		return result;
	}
	
	/**
	 * Methode qui donne les victoires consécutives du joueur
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
	
	public static int maxVicCons() {
		
		
		return 0;
	}
}
