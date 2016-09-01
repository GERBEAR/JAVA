import java.io.Console;

public class AddressChallenge{
	public static void main(String [] args ){
			
			//Declaring our Console 
			Console con = System.console();
			
			String userName;		//Declaring our String to hold data
			int userAge;
			String userAddress;
			
			
			//Prompting the user to input some information
			userName = con.readLine("Enter Your Name:");
			
			userAge = Integer.parseInt(con.readLine("Enter Your Age : "));
			
			userAddress = con.readLine("Enter Your Address:");
			
			System.out.println("Your name is  " + userName);
			
			System.out.println("Your Age is " + userAge);
			
			System.out.println("Your address is " + userAddress);
			
	}

}