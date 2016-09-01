package com.ocja.registration;

import java.util.Arrays;
import java.util.Scanner;

public class SpaghettiReg {

	public static void main(String[] args) {			//Start of your main
          
		Scanner scan = new Scanner(System.in);          //New scanner object

		System.out.print("Enter how many names you want register: "); // ask the user how many names he wants to store
		int regNum = scan.nextInt();                                  //setting up input to a variable

		String[] regArray = new String[regNum];                      // declaring a variable with the length the user enters

		int x = regNum;  											// declaring variables to be used later on
		int menuChoice;
		int counter =0;
		
		for (int i = 0; i < regArray.length; i++) {
			x--;
			System.out.println("Type the name you want to enter: " + x+ " tries left"); // loop asking for the amount of names the user wants to enter
			regArray[i] = scan.next();
		}
		Arrays.sort(regArray);
		
		do{    																			//do while loop for the menu
			
		
		
		System.out.println(
				"What do you want to do? \n (1) View the names that are registered Alphabeticly \n (2) Edit one of the names on the list by choosing which one to change \n (3) Exit the program ");
		 menuChoice = scan.nextInt();
		switch (menuChoice) {														// switch is for the menu options
			case 1:
	
				for (String str : regArray) {									   // 1 advance loop just to print the names
					System.out.println(str);
				}
				break;															  // leaves case when done
			case 2:																 // case 2 for edit
	
				// write code to edit
				System.out.println("Choose the number of the name you want to edit");
				for (String str : regArray) {									//prints out the list with number of choices
					counter++;
					System.out.println(counter+": "+str);
				}
				int editNum = scan.nextInt();									//takes in the new name	
				System.out.println("Enter name you want to change it to:");  
				regArray[editNum -1] = scan.next(); 
				counter= 0;//set's the new name to the correct array 	
				Arrays.sort(regArray);
				break;
			
		}
		}
		
		while(menuChoice != 3);                                               //continues to do while loop until 3 is selected
		
		
		
		
		
		
		
		
		
		
		System.out.println("Good Bye from team Spaghetti!!");              // good bye message
	

}
}