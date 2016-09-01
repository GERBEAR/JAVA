package com.jamiegordon;

//Import Console
import java.io.Console;

	public class GameTimeCalc{
		public static void main(String [] args){
		
			//Declare Console
			Console con = System.console ();
			
			//Type Name = Value
			
			//Declare String names
			String userName;
			String userGame;
			
			//Declare Int names
			double gameTime;
			
			//Prompt user to input gamertag and favorite game
			userName = con.readLine ("Hello \nPlease input your Gamertag: ");
			userGame = con.readLine ("What is your favorite game? ");
			
			//Prompt user to input gamertag and favorite game
			gameTime = Double.parseDouble (con.readLine("How many hours a year \ndo you spend gaming? "));
			
			//Print out user information
			System.out.println ("\nGamertag: " + userName);
			System.out.println ("\nFavorite Game: " + userGame);
			System.out.println ("\nTotal time spent gaming: ");
			System.out.println ("\n Yearly: " + gameTime);
			System.out.println ("\n Monthly: " + gameTime/12);
			System.out.println ("\n Weekly: " + gameTime/52);
			System.out.println ("\n Daily: " + gameTime/365);
			
				
			
		}
	}