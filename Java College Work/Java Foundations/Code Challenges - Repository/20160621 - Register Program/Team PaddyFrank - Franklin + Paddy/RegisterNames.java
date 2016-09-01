package com.ocja.franklin.arraychallenges;

import java.util.Scanner;

public class RegisterNames {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in); // declare scanner for input
		
		//Ask user to input number of names they want to register
		System.out.print("Input number of names you want to register: ");
			
		int userInput = scan.nextInt(); // stores number in userinput
		
		String[] register = new String[userInput]; // create array of numbers
		
		// prompts to enter names to populate array register
		
		for(int i = 0; i < register.length; i++){
			System.out.println("Enter the name you want to register: ");
				register[i] 	= scan.next();		
			
		}
		
		
		
		boolean isRunning = true;
		
		do{
			System.out.println("Choose 1) to view rergisterd names, (2) to edit a name, (3) Close program ");
		int choice = scan.nextInt();
			
		if(choice == 1){
			int i = 0;
				for(String str : register){
				System.out.println(i+"\t"+ str);
				i++;
				
				}
				
			}else if(choice == 2){
				int i = 0;
				for(String str : register){
				System.out.println(i+"\t"+ str);
				i++;
				
				}
				
				
				System.out.println("Select which entry you want to change: ");
				int userEntry = scan.nextInt();
				
				System.out.println("User Entry is "+userEntry);
				
				 System.out.println("Enter new name: ");
				 String editedName	= scan.next();
				 		register[userEntry]	=	editedName;
				
				}else if(choice == 3){
					
					
					System.out.println("you have exited the program");
					isRunning = false;
				}else{
					System.out.println("Invalid Entry: Try again");
					
				}
				
			
			
		}while(isRunning);
		
		
		
	}
}

/*Ask user to input number of names they want to register
Enter number of names they have choosen to enter
break into a menu where the user will have 3 options
1) View the names that are registered
2) Edit one of the names on the list by choosing which one to change
3) Exit the program


*/