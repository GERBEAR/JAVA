package com.teampoker;

import java.io.Console;
public class GameTimeCalc{
	public static void main(String [] args){
		System.out.println("The Challenge");
		
		
		//declaring Console
		Console con = System.console();
		
		//declaring variables
		String username;
		String favGame;
		double hoursplayedyearly;
		double hoursplayedweekly;
		double hoursplayeddaily;
		
		username = con.readLine("Enter username");
		favGame  = con.readLine("Enter favGame");
		hoursplayedyearly = Double.parseDouble(con.readLine("Enter hoursplayedyearly"));
		hoursplayedyearly = Double.parseDouble(con.readLine("Enter hoursplayedyearly"));
		hoursplayedweekly = Double.parseDouble(con.readLine("Enter hoursplayedweekly"));
		hoursplayeddaily  = Double.parseDouble(con.readLine("Emter hoursplayeddaily"));
		
		
		System.out.println("username is" +username);
		System.out.println("favGameame is" +favGame);
		System.out.println("hourspalyedyearly is" + hoursplayedyearly);
		System.out.println("hoursplayedweekly is" + hoursplayedweekly);
		System.out.println("hoursplayeddaily");
		
	
	
	
	}


}