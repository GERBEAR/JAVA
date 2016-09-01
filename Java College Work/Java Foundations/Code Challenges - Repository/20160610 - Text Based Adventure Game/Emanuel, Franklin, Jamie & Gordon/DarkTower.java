import java.io.Console;

public  class DarkTower{
	public static void main (String[] args){
		
		//Intro
		System.out.println("");
		
		//Declare console
		Console con = System.console();
		
		//boolean for if travel to dark tower is allowed for Roland
		boolean reachTower = false;
		
		//Declare String USERNAME and CHARACTER
		String userName;
		String userCharacter;
		
		//Declare Choice Strings
		String choice1_1;
		String choice1_2;
		String choice1_3;
		String choice1_4;
		String choice1_5;
		String choice1_6;
		
		//Declare int
		int userHealth = 100;
		int crimsonHealth = 100;
		
		//Prompt user to input name and print greeting
		userName = con.readLine(" Hello please enter your name: ");
		System.out.println("\n Hello " + userName + "\n Welcome to the Dark Power Game!");
		
		//Asking user to choose character
		userCharacter = con.readLine("\n Please choose a character, A or B:\n a) Roland\n b) Eddie Dean\n ");
		
		//Roland's quest
		if(userCharacter.equalsIgnoreCase("A")){
			System.out.println("\n You have chosen Roland\n Roland's weapon of choice is a gun\n His health is 100" );
			System.out.println("\n Roland's journey begins in the desert, he is a on a quest to reach the\n Dark Tower." );
			
			//Intro to where you are and ask first question
			System.out.println("\n Walking through the desert Roland reaches a sign post with 2 ways to go: \n a)Way Station \n b)New Cann" );
			choice1_1 = con.readLine("\n Please choose an option: ");
			
				//If chooses way station
				if(choice1_1.equalsIgnoreCase("A")){
					System.out.println("\n Welcome to the way station\n Please get on board Blaine the Train" );
					
					//Blaine asks 3 questions
					System.out.println("\n However in order to get to your destination you will need to\n answer 1 of 3 questions" );
					choice1_2 = con.readLine("\n Please choose a question: \n Question a) \n Question b) \n Question c) ");
					
						//User picks their question, if correct move on, if not die
						if(choice1_2.equalsIgnoreCase("A")){
							choice1_3 = con.readLine("\n What colour is the sky?\n a) Red\n b) Blue\n c) Green " );
								if(choice1_3.equalsIgnoreCase("B")){
									System.out.println("\n Correct!\n I will take to your destination......." );
									reachTower = true;
								}else{
							
									System.out.println("\n Incorrect!\n Blaine the Psychopathic Train killed you!!!" );
									System.out.println("\n Thank you for playing!" );
								}
						}else if(choice1_2.equalsIgnoreCase("B")){
									choice1_4 = con.readLine("\n What colour is grass?\n a) Red\n b) Blue\n c) Green");
									if(choice1_4.equalsIgnoreCase("C")){
										System.out.println("\n Correct!\n I will take to your destination......." );
										reachTower = true;
									}else{
									System.out.println("\n Incorrect!\n Blaine the Psychopathic Train killed you!!!" );
									System.out.println("\n Thank you for playing!" );
									}
						}else if(choice1_2.equalsIgnoreCase("C")){
									choice1_5 = con.readLine("\n What colour are strawberries?\n a) Red\n b) Blue\n c) Green");
									if(choice1_5.equalsIgnoreCase("A")){
										System.out.println("\n Correct!\n I will take to your destination......." );
										reachTower = true;
									}else{
									System.out.println("\n Incorrect!\n Blaine the Psychopathic Train killed you!!!" );
									System.out.println("\n Thank you for playing!" );
									}
						}
				}
		}
		
		//Eddie's quest
		if(userCharacter.equalsIgnoreCase("B")){
			System.out.println("\n You have chosen Eddie Dean\n Eddie Dean's weapon of choice is a machete\n His health is 100" );
			System.out.println("\n Eddie's journey begins in the desert, he is a on a quest to reach the\n Dark Tower." );
			System.out.println("\n Walking through the desert Roland reaches a sign post with 2 ways to go: \n a)Way Station \n b)New Cann" );
			choice1_1 = con.readLine("\n Please choose an option: ");
			
				//First option
				if(choice1_1.equalsIgnoreCase("A")){
					System.out.println("\n eddie its working" );
				}
		}
		
		//Dark Tower Quest Line
		if(reachTower == true){
			System.out.println("\n Welcome to the Dark Tower\n You will now battle the crimson king" );
			System.out.println("\n Welcome to the Dark Tower" );
			choice1_6 = con.readLine("\n The fight begins!!!\n a) Roland dives to cover and takes out his gun\n b) Roland runs toward the Crimson King with his knife\n c) Roland stands his ground and pulls out his gun" );
				if(choice1_6.equalsIgnoreCase("A")){
					crimsonHealth = 100-50;
					System.out.println("crimsonHealth" + crimsonHealth);
				}
		}
		
		
	}
}