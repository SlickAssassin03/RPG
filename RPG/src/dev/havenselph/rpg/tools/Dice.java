package dev.havenselph.rpg.tools;

// Dice object

// Imports Start
import java.util.Random;
// Imports End

public class Dice {
	private static Random r = new Random();
	public static int rollSix() {
		return roll(6);
	}
	
	public static int rollNine() {
		return roll(9);
	}
	
	public static int rollTwelve() {
		return roll(12);
	}
	
	private static int roll(int max) {
		return (r.nextInt((max-1))+1);
	}

}
