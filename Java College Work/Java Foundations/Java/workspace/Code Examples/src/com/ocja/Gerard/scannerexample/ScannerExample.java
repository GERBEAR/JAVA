package com.ocja.Gerard.scannerexample;

import java.util.Scanner;
public class ScannerExample {

	public static void main(String[] args) {
		
		//Declare and initialize our scanner
		Scanner scan = new Scanner(System.in);
		
		//Prompt the user to enter their name
		System.out.print(" Enter Your Name: ");
		String userName = scan.nextLine();
		
		//Output the namer after we have gotten it
		System.out.println("\n Hello There " + userName);
		
		//Prompt the user to enter their age
		System.out.println("\n Enter Your Age: ");
		int userAge = scan.nextInt(); // Receives int input
		
		//Output the age after we have gotten it
		System.out.println("\n You Are "+userAge+" Years Old. ");
		
		scan.close(); //Closes the scanner after we have finished 
		
	}//end main

}//end class
