package com.franklincraig.example;
import java.io.Console;
public class GameTimeCalc{

	public static void main(String[] args){
	
	// declare console
	
	Console con = System.console();
	
	// declare variables
	String userName;
	String favouriteGame;
	double hoursAYear;
	double hoursPerWeek;
	double hoursPerDay;
	
	
	userName = con.readLine(" User Name: ");
	
	favouriteGame = con.readLine(" \nFavourite Game: ");
	
	hoursAYear = Double.parseDouble( con.readLine("\nHours I play the game in a Year:  "));
	
	System.out.println("\nUser name is "+userName);
	
	
	System.out.println("\nFavourite game is:  "+favouriteGame);
	
	
	System.out.println("\nHours I play game in a Year: "+hoursAYear);
	
	// Calculations
	
	hoursPerWeek = hoursAYear / 52 ; // 52 is num of weeks in a year
	
	hoursPerDay  = hoursPerWeek / 7; // 7 is number of days in a week
	
	System.out.println("\nhours per Week I play Game:  "+hoursPerWeek);
	
	
	System.out.println("\nhours per day I play Game:  "+hoursPerDay);
	}

}