import java.io.Console;

public class Riddler{
	public static void main(String[] args){
		String userAnswer;
		Console con = System.console();
		userAnswer = con.readLine("What's between heavan and earth? ");

		//if(true) do code ELSE do other code
		if(userAnswer.equalsIgnoreCase("and")){
			System.out.println("Correct - it was and");
		}else{
			System.out.println(userAnswer + " is the wrong answer.");
		}
	}
}
