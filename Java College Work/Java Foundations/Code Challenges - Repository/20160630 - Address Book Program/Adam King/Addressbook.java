package com.ocja.addressbook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Addressbook {
	private static ArrayList<Contact> myList = new ArrayList<Contact>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int userInput = 0;
		int counter = 0;

		do {
			System.out.println(" press: \n 1. Add Contact \n 2. View Contacts \n 3. Search \n 4. Exit");
			userInput = scan.nextInt();
			if (userInput == 1) {

				createContact();

			} else if (userInput == 2) {

				viewContacts();

			} else if (userInput == 3) {
				searchContacts();
			}else if(userInput == 4){
				
				
				
				
				
				
			} else
				System.out.println("incorrect input try again");

		} while (userInput != 4);
		System.out.println("Good bye");

	}

	public static void createContact() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a First Name: ");
		String fNinput = scan.nextLine();

		System.out.println("Please enter a Last Name: ");
		String lNinput = scan.nextLine();

		System.out.println("Please enter a Phone Number: ");
		String pHinput = scan.nextLine();

		System.out.print("\n");

		Contact myContact = new Contact(fNinput, lNinput, pHinput);
		myList.add(myContact);

	}

	public static void viewContacts() {
		Collections.sort(myList);
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i).toString());
			System.out.print("\n");

		}
		

	}
	
	public static void searchContacts(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Last Name to search: ");
		String lNinput = scan.nextLine();
		int flag=1;
		for (int i = 0; i < myList.size(); i++) {
			if(lNinput.equals(myList.get(i).getlName())){
				
				
			System.out.println(myList.get(i).toString());
			System.out.print("\n");
			
			flag = 1;
			}
			
		}
		if (flag == 0);
		System.out.println("not found");
		
		
	}

}
