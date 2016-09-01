package com.ocj.adamk.challenges.looppractice;

import java.util.Scanner;

public class SoccerThing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		System.out.println(" Enter your teams name ");
		String teamName = scan.nextLine();
		
		
		System.out.println("how many games did they play? ");
		int matchesPlayed = scan.nextInt();
		
		for (int x = 0; x<matchesPlayed; x++){
			System.out.println("For game no "+(x+1)+" did they (W)in (D)raw or (L)ose?");
			String gameResult = scan.next();
				if(gameResult.equals("w")){
					total += 3;
					
				}
				else if(gameResult.equals("d")){
					total +=1 ;
					
				}
				//else if(gameResult.equals("l")){
					
				//}
			
			
			
		}
		System.out.println("the total points are: "+total);
	}

}
