package com.GerardKeogh;
import java.io.Console;

public class TaskApp{
	public static void main(String[] args){
		System.out.println("Welcome to TaskApp");
		
		//Declaring our Console 
			Console con = System.console();
			
			String currentDay;		//String to hold data
			
			
		//Getting the user to enter some information
			
		currentDay = con.readLine("Enter Current Day: ");
		
		//message to say "Hope your having a nice current day"
		
		System.out.println("Hope Your Having A Nice " + currentDay);
		
		
		//message now asking for Name and Age & getting the string to hold data
		
		String userName;
		int userAge;
		
		// Getting the user to enter some information
		
		userName = con.readLine("Enter Your Name: ");
		
		userAge = Integer.parseInt(con.readLine("Enter Your Age: "));
		
		//message to tell the user how hold they will be in 3 years
		
		System.out.println("You will be " + (userAge + 3) + " in 3 years");
		
		
		
	}
}