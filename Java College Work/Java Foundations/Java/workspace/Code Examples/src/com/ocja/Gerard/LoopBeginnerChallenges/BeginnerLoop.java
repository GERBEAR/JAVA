//While Loop for this challenge.
// Declare a variable with the value of 10000;
// As long as that variable is above 1000 keep decrementing 239 from it.
// Print the value after each decrement.

package com.ocja.Gerard.LoopBeginnerChallenges;

import java.util.Scanner;

public class BeginnerLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // declaring our scanner after importing it.
		
		int num1 = 10000;
		
		while (num1 > 1000 ){
			System.out.println(num1);
			num1 = num1 -239;
		
		}// end loop
			
		

	}// end main

}// end class
