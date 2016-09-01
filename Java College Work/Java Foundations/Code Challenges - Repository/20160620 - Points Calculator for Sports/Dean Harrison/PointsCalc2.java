import java.util.Scanner;
public class PointsCalc2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		//Prompts the user to input their favourite team.
		System.out.print("What is your favourite team? ");
		String userTeam = scan.nextLine();
		
		//Prompts the user to input the number of games their team has played
		System.out.print("How many games has "+userTeam+" played so far? ");
		int numPlayed = scan.nextInt();
		
		//Creates a counter for the team's points
		int totalPoints = 0;
		
		//How many wins
		System.out.print("How many games as "+userTeam+" won? ");
		int totalWins = scan.nextInt();
		
		//How many losses
		System.out.print("How many games as "+userTeam+" lost? ");
		int totalLosses = scan.nextInt();
		
		//How many draws
		System.out.print("How many games as "+userTeam+" tied? ");
		int totalDraws = scan.nextInt();
		
		//Total up the points
		totalPoints = (3 * totalWins) + (totalDraws);
		
		//Ouputs the total to the user at the end.
		System.out.println(userTeam+" has earned a total of " +totalPoints+" points this season.");
		
	}
}
/*
	A program, which asked the user their favourite team
	then it asked how many games their team has played
	
	Then for each game they've played, it asks them
	was the game a win or a loss or a draw.
	
	After it gets these values it accumulates the points
	into one total, which is output at the end.
*/