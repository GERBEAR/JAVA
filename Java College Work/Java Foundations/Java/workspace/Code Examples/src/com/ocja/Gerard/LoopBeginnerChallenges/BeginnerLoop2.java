//For Loop for this challenge 
//Ask the user to enter their name,
//then ask the user to enter how many times they want their name printed.
//Print the users name that many times.


package com.ocja.Gerard.LoopBeginnerChallenges;
import java.util.Scanner;

public class BeginnerLoop2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // declaring our scanner
		
		String userName;
		int userNum;
		
		System.out.print(" Enter Your Name: ");// prompting user to enter info
		userName = scan.nextLine();
		System.out.print(" How Many Times Would You Like Your Name To Be Printed?.");// prompting user to enter info
		userNum = scan.nextInt();
		
		System.out.println("User Name: " +userName+" : Num is: "+userNum);
		
		//initialization, condition, increment
		for(int i = 0; i < userNum; ++i){
			System.out.println(userName);
			
		}//end loop
		
		
		

	}//end main

}//end class
