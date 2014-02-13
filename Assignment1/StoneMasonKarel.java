/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	// You fill in this part
	public void run() {
		turnLeft();
		while (frontIsClear()) {
			replaceColumn();
			move();
		}
			replaceColumn();
			descend();
			fourMoves();
			turnLeft();
		while (frontIsClear()) {
			replaceColumn();
			move();
		}
			replaceColumn();
			descend();
			fourMoves();
			turnLeft();
		while (frontIsClear()) {
			replaceColumn();
			move();
		}
			replaceColumn();
			descend();
			fourMoves();
			turnLeft();
		while (frontIsClear()) {
			replaceColumn();
			move();
		}
			replaceColumn();
			descend();
			turnLeft();
		}
	

		/*while (frontIsClear()) {
			replaceColumn();
			move();
			}
		replaceColumn();
		descend();
		turnLeft();
		fourMoves();
		turnLeft();
		while (frontIsClear()) {
			replaceColumn();
			move();
			}
		descend();
		turnLeft();
		fourMoves();
		turnLeft();
		while (frontIsClear()) {
			replaceColumn();
			move();
			}
		descend();
		turnLeft();
		fourMoves();
		}*/
	
	
	
	//sees if space is empty and puts beeper in if needed
	private void replaceColumn() {
		if (noBeepersPresent()) {
			putBeeper();
		} 
	}

	
	//returns to bottom of column
	private void descend() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		}
	//moves four spaces to the next arch
	private void fourMoves() {
		turnLeft();
		move();
		move();
		move();
		move();
	}
}
	/*while (frontIsClear()) {
		move(); 
		}
	turnLeft();
	while (frontIsClear()) {
		replaceColumn();
		move();
		}
	replaceColumn();
	turnLeft();
	fourMoves();
	turnLeft();
	while (frontIsClear()) {
		replaceColumn();
		move();
		}
	replaceColumn();
	ascend();
	turnLeft();
	fourMoves();
	turnLeft();
	while (frontIsClear()) {
		replaceColumn();
		move();
		}
	replaceColumn();
	ascend();
	turnLeft();
	fourMoves();
	turnLeft();
	while (frontIsClear()) {
		replaceColumn();
		move();
		}
	replaceColumn();
	turnLeft();
	}
	//sees if space is empty and puts beeper in if needed
	private void replaceColumn() {
			if (noBeepersPresent()) {
				putBeeper();
			}
		}	
	
	//returns to top of column
	private void ascend() {
		turnAround();
		while (frontIsClear()) {
			move();
		}
		}
	

	}*/


