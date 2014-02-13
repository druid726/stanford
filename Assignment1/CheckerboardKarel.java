/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// code to make a checkerboard pattern
	public void run () {
		if (frontIsBlocked()) {
			turnLeft();
		}
		while (frontIsClear()) {
			placeBeepersInEveryOtherCorner();
			aroundLeft();
			placeBeepersInEveryOtherCorner();
			aroundRight();
		}

	}
	private void placeBeepersInEveryOtherCorner() {
		while (frontIsClear()) {
			move();
			putBeeper();
			if (frontIsClear()) {				
				move();
			} 
		}
	}
	
	//moving up a row when at the right end of a row
	private void aroundLeft() {
		turnLeft();
		if (frontIsClear()) {
			move();
			turnLeft();
		}
	}
	//moving up a row at the left end of a row
	private void aroundRight() {
		turnRight();
		if (frontIsClear()) {
			move();
			turnRight();
		}
	}
}
		