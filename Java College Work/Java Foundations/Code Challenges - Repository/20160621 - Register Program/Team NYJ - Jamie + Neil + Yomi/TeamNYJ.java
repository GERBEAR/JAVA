import java.util.Scanner;

public class TeamNYJ {
		public static void main(String [] args){
			
		//Declaring our Scanner
		Scanner scan = new Scanner(System.in);
		
		//Declare int
		int menuInput;
		int menuInput2;
		int i = 0;
		int j = 0;
		
		
		//Declare Boolean
		boolean isRunning = true;
		
		//Prompt user to enter the number of names they want to register
		System.out.print("Enter the number of names you would like to register: ");
		int noOfNames = scan.nextInt();	
		
		//Declare array and string
		String[] userNames = new String[noOfNames];
		
		//Prompt user to input names
		for(; i < noOfNames; ++i){
			System.out.print("Please enter the names:");
			userNames[i] = scan.next();
		}
		
		//Bring up menu options
		do{
			System.out.println("\nPlease choose an option:\n 1)View registered names\n 2)Edit names\n 3)Exit\n");
			menuInput = scan.nextInt(); //Get input from user for menu choice
			
			
			
			if(menuInput == 1){
					//For loop, print out all names
					for(String names : userNames){
						System.out.println(names);
					}
			}else if(menuInput == 2){
				//For loop, print out names with numbers so user can choose which one to edit
				for(String names : userNames){
					System.out.println(j + ")" + names);
					++j;
				}	
				
				//Ask user which name to edit
				System.out.println("\nPlease enter the number of the name you want to edit: ");
				menuInput2 = scan.nextInt(); //Get input from user for menu 2 choice
				
				//Enter new name
				System.out.println("\nEnter new name: ");
				String editName = scan.next();
				
				//Assign new name
				userNames [menuInput2] = editName;
				
			}else if(menuInput == 3){
				isRunning = false;
			}else{
				System.out.println("\nInvalid option please choose again.");
			}
		}while(isRunning);
		
		//Close scanner
		scan.close(); 
			
	
				
}
}/*Space between user input and print out
System.out.println("\n");

//Print out user input
for(int i = 0; i < famousPeople.length; i++){
	System.out.println(famousPeople[i]);
}

//Space between user input and print out
System.out.println("\n");

//Advanced for loop
for(String names : famousPeople){
	System.out.println(names);
}

//Close scanner
scan.close(); */
