package com.joshcarroll;
import java.io.Console;
	
public class GameTimeCalc{
	public static void main(String[] args){
			Console con = System.console();
			
			//Declaring our String to hold data
			String userGamerTag;
			
			String userFavGame;
			
			int usergameTime;

			
			//Prompting the user to input some information
			userGamerTag = con.readLine("Enter your gamer tag: ");
			
			userFavGame = con.readLine("Enter your favourite game: ");
			
			usergameTime = Integer.parseInt(con.readLine("Enter the amount of hours per year you play games: "));
			
			
			//Prompting the program to print information			
			System.out.println("Your gamertag is: " + userGamerTag + "\n");
			
			System.out.println("Your favourite game is: " + userFavGame + "\n");
			
			System.out.println("You play " + usergameTime + " hours per year\n");	
			
			System.out.println("You play " + usergameTime/52 + " hours per week\n");	
			
			System.out.println("You play " + usergameTime/365 + " hours per day\n");	
	}		
}
