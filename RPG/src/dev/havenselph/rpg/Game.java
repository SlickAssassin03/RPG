package dev.havenselph.rpg;

// Root file for the game.

// Imports Start
// ------------
// Imports End

public class Game {
	public static boolean running; // set true at start of program
	private static GameLogic logic = new GameLogic();
	
	public static void main(String[] args) {
		running = true;
		
		// ------------
		
		while (running) {
			loop();
		}
		running = false; // fail-safe in the case of a weird bug during iteration
		stop();
		// ------------
	}
	
	public static void loop() {  // add all loop stuff
		logic.getCommand();
	}
	
	public static void stop() {  // keep track of what needs to be here
		// TO-DO: make sure that all things associated with closing are handled here
	}
}

// Remember to watch video of someone doing this for real to get an idea of what needs to be done 
// within the player item and npc classes.