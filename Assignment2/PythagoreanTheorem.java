/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		/* Describes the program */
		println("This program finds the c value for the PythagoeranTherom");
		/* asks the user for a value for a */
		double a = readDouble("Please enter a value for a: ");
		/* asks the user for a value for b*/
		double b = readDouble("Please enter a value for b: ");
		/* the formula for determining the value of c*/
		double c = Math.sqrt(a*a + b*b) ; 
		/* prints out computation to the screen*/
		println("The value is equal to "+ c + ".");
	}
}
