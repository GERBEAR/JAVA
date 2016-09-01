//Ask a user to input two number. The first number will be multiplied by itself as many times as the second number.
//If I enter 10 and then 2,
//it will return the value of 10 x 10

package Loopchallenges;
import java.util.Scanner;

public class loopchallanges {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // declaring our scanner
		
		//Asking the user to input two numbers
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your first number:");
		int num1 = in.nextInt();
		System.out.println("Please enter your second number: ");
		int num2 = in.nextInt();
		int total = num1;
		
		
		//First number will be multiplied by itself as many times as the second number.
		
		for( int i = 0; i < num2; i++){
			
			total = total * num1;
			
		}// end loop
		
		System.out.println(total); // Prints out result 
			
	

	}//end main

}//end class
