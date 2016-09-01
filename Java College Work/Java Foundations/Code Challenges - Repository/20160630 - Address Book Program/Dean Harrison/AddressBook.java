package com.dean.objects;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	/*
	 * We declare the ArrayList here
	 * because this makes it accesible to
	 * all parts of our class.
	 */
	private static ArrayList<Contact> people = new ArrayList<Contact>();

	public static void main(String[] args) {
		//Kicks off the program.
		displayMenu();
	}	
	
	/*
	 * A method which just displays a menu
	 * to the user, based on their selection
	 * it will then call the appropriate 
	 * method associated with that choice.
	 */
	public static void displayMenu(){
		Scanner scan = new Scanner(System.in);
		do{			
			System.out.println("Welcome, choose one of the following: ");
	
			System.out.println("1) Add new Person");
			System.out.println("2) View People");
			System.out.println("3) Exit");
			
			System.out.print("Enter the number: ");
			int userChoice = scan.nextInt();
			
			if(userChoice == 1){
				addPerson();
			}else if(userChoice == 2){
				viewPeople();
			}else if(userChoice == 3){
				break;
			}else{
				System.out.println("Invalid input, choose again.");
			}
			
		}while(true);		
	}
	/*
	 * A method which is used to ask the
	 * user to enter in details of a contact.
	 * Then creates a Contact object with those
	 * details and adds it to the list
	 */
	public static void addPerson(){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter in the persons name: ");
		String persName = scan.next();

		System.out.print("Enter in the persons number: ");
		String persNum = scan.next();
		
		Contact tempPerson = new Contact(persName, persNum);
		people.add(tempPerson);
		
	}
	/*
	 * A method which simply prints out all 
	 * of the Contact objects stored within
	 * the list of Contacts
	 */
	public static void viewPeople(){
		for(Contact p : people){
			System.out.println(p.getName() + "\n" + p.getAge());
		}
	}
}
