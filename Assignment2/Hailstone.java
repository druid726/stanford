/*
 * File: Hailstone.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the Hailstone problem.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {
		/* You fill this in */
		int n = readInt("Please input a number: ");
		int steps = 1;
		/*int even = n = n / 2;
		int odd = n = 3*n + 1;*/
			while (n > 1) {
				if ((n % 2) == 0) {
					println(n +	" is even divide by 2.");
					n /= 2;
					} else {
					println(n + " is odd, multiply by 3 and add 1.");
					n = 3 * n + 1;
				}
				steps++;
			}
			println("It took "+ steps + " steps to complete." );
	}
}



