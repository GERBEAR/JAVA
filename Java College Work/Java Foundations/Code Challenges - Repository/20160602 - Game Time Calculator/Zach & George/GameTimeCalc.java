package com.zacharchbold;
import java.io.Console;
public class GameTimeCalc{
	public static void main(String[] args){
	
		String userName ;
		String favGame;
		int gameTime;
		
		Console con = System.console();
		
		userName = con.readLine("Enter your Gamertag:");
		favGame = con.readLine ("Enter your FavGame:");
		gameTime = Integer.parseInt(con.readLine("your gameTime"));
		
		System.out.println("Gamertag");
		System.out.println("FavGame");
		System.out.println("You play " + gameTime + "hours per year");
		System.out.println("you play" + gameTime/52 + "hours per week");
		System.out.println("you play" + gameTime/365 + "hours per day");
		}
}		