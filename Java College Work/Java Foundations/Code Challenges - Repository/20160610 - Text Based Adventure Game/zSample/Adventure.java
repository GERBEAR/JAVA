import java.io.Console;
public class Adventure{
	public static void main(String[] args){
		//Declaring a String with the value of a bunch of new lines, printing this string will simulate a clear screen
		String cls = "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
			
		System.out.println(cls); //Clearing the screen
		
		//Welcome Message
		System.out.println("Welcome to the Mystery Dungeon Adventure challenge, you will be put in scenarios that will test your resolve as well as your determination to survive and escape!");
		
		Console con = System.console();
		//This line will just wait for the user to press enter before continueing.
		
		con.readLine("\n\nPress enter to continue...");
		
		//retrieve user name
		System.out.println(cls);	//Clearing the screen
		String userName = con.readLine("What is your name, adventurer?\n ");
		
		//Prints out all of the choices available to the user
		//retrieve character choice
		System.out.println(cls);
		System.out.println("Welcome "+userName+" your adventure begins now!");
		System.out.println("\n\nWhich of the following classes best describe you?");
		System.out.println("\nA - Warrior, battle hardened with a massive two-handed axe and heavy plate armor.");
		System.out.println("\nB - Mage, an intellegent spell caster trained in the arts of manipulating the primal elements, such as air, water, lightning and fire.");
		System.out.println("\nC - Hunter, born and raised in the wilderness, taught to survive on basic primal instincts. Favouring the bow as their weapon of choice.");
		System.out.println("\nPlease enter the corresponding letter of the type of adventurer you want to be");
		String classChoice = con.readLine("\n");
		
		System.out.println(cls);
		
		//If statement to print out te users choice.
		int healthPoints = 0;
		if(classChoice.equalsIgnoreCase("a")){
			System.out.println("You have chosen the way of the warrior");
			healthPoints = 120;
		}else if(classChoice.equalsIgnoreCase("b")){
			System.out.println("You have chosen the magic of the mage");
			healthPoints = 90;
		}else if(classChoice.equalsIgnoreCase("c")){
			System.out.println("You have chosen the instincts of the hunter");
			healthPoints = 100;
		}
		
		//Wait for the user to read and press enter to continue.
		con.readLine("\n\nPress enter to continue...");
		
	
		//present first scenario with 3 options
		System.out.println(cls);
		System.out.println("You awake in a dark dungeon, you are disorientated and take some time to gather yourself and assess your surroundings. \n\nYou see a small window to your left with what appears to be moonlight shining through. \nYou also spot what appears to be the outline of a door to your right.");
		
		System.out.println("What do you do?");
		System.out.println("A - Walk towards the window and investigate");
		System.out.println("B - Walk towards the door");
		System.out.println("C - Stay where you are and gather yourself some more");
		
		//Ask the user to choose their option
		String userChoice_1 = con.readLine("\nEnter the letter from the choices above.\n:");
		
		System.out.println(cls);
		
		//Give the user the consequences of their actions.
		if(userChoice_1.equalsIgnoreCase("a")){
			System.out.println("You walk towards the window and find some fruit, giving yourself a healthy feeling after eating it.");
			healthPoints = healthPoints + 10;
		}else if(userChoice_1.equalsIgnoreCase("b")){
			System.out.println("You walk towards the door and find that it is locked.");
		}else if(userChoice_1.equalsIgnoreCase("c")){
			System.out.println("You stay where you are to gather yourself and your thoughts. However unexpectingly you get bitten by a rat causing yourself to become infected.");
			healthPoints = healthPoints - 20;
		}
	}
}