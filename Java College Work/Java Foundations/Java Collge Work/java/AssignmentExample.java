package com.GerardKeogh;
import java.io.Console;

	public class AssignmentExample{
		public static void main(String [] args){
		
		// Declaring 3 initialize Strings
		
		Console con = System.console();
		
		String gamerTag;
		String favouriteGame;
		String whichConsole;
		
		//User entering information
		
		gamerTag = con.readLine ("Enter Your GamerTag: ");
		favouriteGame = con.readLine("Enter Your Favourite Game: ");
		whichConsole = con.readLine("Which Console Did You Play On: ");
		
		//Declaring 3 initialize ints
		
		int hoursPlayed;
		int daysaWeek;
		int yearsPlayed;
		
		// User entering information
		
		hoursPlayed = Integer.parseInt(con.readLine("How Many Hours Have You Played On " + favouriteGame ));
		daysaWeek = Integer.parseInt(con.readLine("How Many Days A Week Do You Play On  " + favouriteGame ));
		yearsPlayed = Integer.parseInt(con.readLine("How Many Years Have You Played On " + favouriteGame ));
		
		
		}
		
	}