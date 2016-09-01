import java.util.Scanner;
public class PointsCalc{
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
		
		//For loop which loops for each of the games played by the team
		for(int i = 0; i < numPlayed ;++i){
			//Prompts the user to see if each game was a win loss or a draw.
			System.out.print("Was game number " +i+" a win, loss, or a draw? ");
			String result = scan.next();
			
			//Checks to see what the user has chosen
			if(result.equalsIgnoreCase("win")){
				System.out.println("\nWin, so they get +3");
				totalPoints = totalPoints + 3;	//Win
			}else if(result.equalsIgnoreCase("draw")){
				System.out.println("\nDraw, so they get +1");
				totalPoints++;					//draw
			}else if(result.equalsIgnoreCase("loss")){
				System.out.println("\nLoss, so they get nothing at all");
												//loss
			}else{
				//Here we decrement the counter to re-do the current iteration
				System.out.println("invalid input - try again");
				--i;
			}
		}
		
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