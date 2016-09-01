import java.io.Console;
public class RegNamingChallange{
	public static void main(String [] args){
		Console con = System.console();
		
		System.out.println("Hi");
		System.out.println("Welcome to this Registration program where you will be able to input details about people.");
		
		int userInputAmount;
		userInputAmount = Integer.parseInt(con.readLine("How many people would you like me to remember? : "));//this will remember the amount of names user wants to input
		
		String[] names = new String[userInputAmount]; 
		
		System.out.println("Please type in your names that you would like me to store");
		
		for(userInputAmount= 0; userInputAmount < names.length ; userInputAmount++){
			names [userInputAmount]= con.readLine("Enter your names: ");
			//That's great, please type in your name, which you want me to store: ");
		}
		do{
		int userChoice = Integer.parseInt(con.readLine("1- View the names you have registered:\n2- Edit one of the names you have registered:\n3- Would you like to EXIT!"));
			if(userChoice == 1){
				for(String str : names){
					System.out.println(str);
					
				}		
			}
			else if(userChoice == 2){
				System.out.println("Great, you choose to edit one of the names, I will list them out for you:");
				int i = 1;
				for(String str : names){
					
				System.out.println(i++ +"- "+ str);
				System.out.println("Which one would you like to edit, pick a number please: ");
				//int userEditChoice = con.readLine();
				//names[0] = userEditChoice 1;
				
				
				
				}
				
				break;
			}
			else if(userChoice ==3){
				System.out.println("exit goodbye");
				break;	
			}
		}while(true);
		
		
		
		
		
		
	}	}
