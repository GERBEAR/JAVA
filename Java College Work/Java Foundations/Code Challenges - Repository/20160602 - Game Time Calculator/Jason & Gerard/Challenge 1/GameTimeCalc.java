package com.jasonmckeon;
import java.io.Console;

	public class GameTimeCalc{
		public static void main(String [] args){
			
		// Declaring 3 initalize Strings
		
		Console con = System.console();
		
		String gamerTag;
		String favouriteGame;
		String whichConsole;
		
		//User entering information
		
		gamerTag = con.readLine ("\n Enter Your GamerTag: ");
		favouriteGame = con.readLine("\n Enter Your Favourite Game: ");
		whichConsole = con.readLine("\n Which Console Did You Play On: ");
		
		// Asking User for information, declaring 3 initalizing ints
		
		int gameTime;
		
		//Prompting The User To Print Information
		
		gameTime = Integer.parseInt (con.readLine("\n How Many Hours A Year Do You Spend Gaming? "));
		
		//Print out user information
			
			System.out.println ("\n Yearly: " + gameTime);
			System.out.println ("\n Monthly: " + gameTime/12);
			System.out.println ("\n Weekly: " + gameTime/52);
			System.out.println ("\n Daily: " + gameTime/365);
			
		
		}
		
}