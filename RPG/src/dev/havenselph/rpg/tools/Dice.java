/**
 * Class made to easily roll dice for the program.
 */

package dev.havenselph.rpg.tools;
import java.util.Random;

public class Dice {
	public static int rollSix() {
		return roll(5);
	}
	
	public static int rollNine() {
		return roll(8);
	}
	
	public static int rollTwelve() {
		return roll(11);
	}
	
	private static int roll(int max) {
		Random r = new Random();
		return (r.nextInt(max)+1);
	}

}
