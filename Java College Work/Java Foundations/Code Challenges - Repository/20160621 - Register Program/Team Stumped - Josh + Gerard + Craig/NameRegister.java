package com.ocja.Gerard.CodeChallenges;
import java.util.Scanner;
import java.util.Arrays;

public class NameRegister {

	public static void main(String[] args) {
		
		String cls = "\n\n\n\n\n\n\n\n\n\n\n\n";
		Scanner scan = new Scanner(System.in); //Declaring our scanner
		
		System.out.println("Enter Number Of Names You Wish To Register: ");//You will ask the user to input the number of names they want to register.
		int userNum = scan.nextInt();
				
		String[] registerNames = new String[userNum];
		
		for(int i = 0; i < registerNames.length; i++){
			System.out.println("Enter The Names Of The Specified Number: ");//Then you will ask the user to input the number of names that they have chosen to enter. 
			registerNames[i] = scan.next();
		}//end for loop
		
		Object[] possibilities ={ "'View Names Registerd', 'Edit Registered Name', 'Exit'" }; // Giving The User Choices In The Menu
		int i=1;
		boolean isRunning = true;
		do{
				System.out.println("Please choose from one of the following choices: \n1 - View Names\n2 - Edit Existing Names\n3 - Exit");
				int userChoice = scan.nextInt();
				switch (userChoice){
				
				case 1:
				
					System.out.println("option 1");
					Arrays.sort(registerNames);
					for(String str : registerNames){
						
						//System.out.print(i);
						System.out.println(i+".\t"+str);
						i++;
					}
					i=1;
					
					//System.out.println(cls);
					break;
					
				case 2:
					System.out.println("option 2");
					System.out.print(" what n ame would u like to update(1-"+userNum);
					int updateName= scan.nextInt();
					System.out.println("what would u like to change it to");
					String newName=scan.next();
					registerNames[updateName -1]= newName;
					System.out.println("Update");
					break;
					
				case 3:
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n-Exit");
					isRunning = false; break;
					
				default:
					System.out.println("Incorrect Option");
					break;
				}
				
				}while(isRunning);//end Do While loop
		
				

		scan.close();
	}// end main

}// end class


//You will then break into a menu where
//the user will have 3 options.
//1) View the names that are registered
//2) Edit one of the names on the list by choosing which one to change
//3) Exit the program
