import java.io.Console;

public class ConsoleExample{
	public static void main(String [] args ){
			
			//Declaring our Console 
			Console con = System.console();
			
			String userName;		//Declaring our String to hold data
			
			//Prompting the user to input some information
			userName = con.readLine("Enter Your Name:");
			
			System.out.println("Hello  " + userName);
			
			
	}

}
