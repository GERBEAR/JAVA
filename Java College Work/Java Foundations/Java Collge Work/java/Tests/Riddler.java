import java.io.Console;

public class Riddler{
	public static void main(String[] args){
				String userAnswer;
				Console con = System.console();
		 userAnswer = con.readLine("\n What's Between Heavan And Earth? ");

		//if(true) do code ELSE do other code
		 if(userAnswer.equalsIgnoreCase("and")){
				System.out.println("\n Correct - It Was And");
		 }else{
				System.out.println(userAnswer + "\n Is The Wrong Answer.");
			}

			userAnswer = con.readLine("\n What Room Can You Eat? ");

			if(userAnswer.equalsIgnoreCase("mushroom")){
					System.out.println("\n Correct - It Was Mushroom.");
			}else{
					System.out.println(userAnswer + "\n Is The Wrong Answer.");
				}

					userAnswer = con.readLine("\n What Asks But Never Answers? ");

				if(userAnswer.equalsIgnoreCase("riddle")){
					System.out.println("\n Correct - It Was Riddle");
				}else{
					System.out.println("\n" + userAnswer + "\n Is The Wrong Answer");
				}

			userAnswer = con.readLine("\n What Chair Can Move? ");

			 if(userAnswer.equalsIgnoreCase("Chairman")){
				 System.out.println("\n Correct - It Was Chairman.");
			 }else{
				 System.out.println("\n" + userAnswer + "Is The Wrong Answer");
			 }

			 userAnswer = con.readLine("\n I Can't Go Left, I Can't Go Right, I am Forever Stuck In A Building Over 3 Stories High. What Am I ? ");

			 if(userAnswer.equalsIgnoreCase("Elevator")){
				 System.out.println("\n Correct - It Was Elevator");
			 }else{
				 System.out.println("\n" + userAnswer + "Is The Wrong Answer.");
			 }

			 //userAnswer = con

			 }
}
