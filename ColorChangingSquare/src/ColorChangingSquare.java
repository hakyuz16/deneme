/*
 * File: ColorChangingSquare.java
 * ------------------------------
 * This program puts up a square in the center of the window
 * and randomly changes its color every second.
 */

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

public class ColorChangingSquare extends GraphicsProgram {

	/** Runs the program */
	public void run() {
		// Your code starts here
		GRect sq=new GRect((getHeight()-SQUARE_SIZE)/2 , (getWidth()-SQUARE_SIZE)/2,SQUARE_SIZE,SQUARE_SIZE );
		sq.setFilled(true);
		add(sq);
//		rgen.setSeed(5);
		while(true) {
			sq.setColor(rgen.nextColor());
			pause(PAUSE_TIME);
		}
		// Your code ends here
	}

	/** Size of the square in pixels */
	private static final double SQUARE_SIZE = 100;

	/** Pause time in milliseconds */
	private static final double PAUSE_TIME = 1000;

	/* Instance variables */

	private RandomGenerator rgen = RandomGenerator.getInstance();
}
