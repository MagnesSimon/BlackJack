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
	
	public static double winRate(int nbWin, int nbGame) {
		double result ;
		result = (double) (int)nbWin / (int)nbGame;
		System.out.println("W: " + nbWin + " G:" + nbGame + "   " + nbWin/nbGame);
		System.out.println(result);
		
		return result;
	}
}
