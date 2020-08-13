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
	
	public static float winRate(int nbWin, int nbGame) {
		Float result = (float) 0;
		result = (float) (nbWin/nbGame);
		
		return result;
		 
	}
}
