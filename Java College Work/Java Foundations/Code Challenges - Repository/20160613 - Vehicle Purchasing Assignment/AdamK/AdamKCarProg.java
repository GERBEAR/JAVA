import java.io.Console;

public class AdamKCarProg{
	
	public static void main(String[] args){
		
		Console con = System.console();
		int howMuch;
		int whatType;
		
		System.out.println("Adams Vehicular selector!");
		
		
		
		
		howMuch = Integer.parseInt(con.readLine("How much do you want to spend (pick a number between 5000 and 50000 euros?: "));
		
		while(howMuch <5000 || howMuch >50000){
			System.out.println("Price out of range please try again");
			howMuch = Integer.parseInt(con.readLine("How much do you want to spend (pick a number between 5000 and 50000 euros?: "));
		}
		
		
		
		whatType = Integer.parseInt(con.readLine("enter 1 for a sportscar, 2 for a bike or 3 for a family car: " ));
		
		while(whatType < 1 || whatType > 3 ){
			System.out.println("you have to pick a number from one to three.");
			whatType = Integer.parseInt(con.readLine("enter 1 for a sportscar, 2 for a bike or 3 for a family car: " ));

		}
		
		
		
		if(howMuch >= 40000 && howMuch <= 50000){
			switch(whatType){
				case 1  :
					System.out.print("second hand R34 GTR");
					break;
				case 2 :
					System.out.print("dunno Ducatiti I guess thats a lot to spend on a bike tbh");
					break;
				case 3 :
					System.out.print("RS6 Estate, loads of room for the family");
					break;
			}
		}
		else if(howMuch >= 20000 && howMuch <40000){
			switch(whatType){
				case 1:
					System.out.print("Highly modified R33 or R32 GTR ");
					break;
				case 2:
					System.out.print("any of the Japanese race replicas");
					break;
				case 3:
					System.out.print("Subuaru Forester STI estate.");
					break;
				
			}
		}
		else if(howMuch >= 5000 && howMuch < 20000){
			switch(whatType){
				case 1:
					System.out.print("Stock R33 or R32 GTR");
					break;
				case 2:
					System.out.print("Something new Japanese and fast");
					break;
				case 3:
					System.out.print("Second hand M5 Estate");
					break;
			}
		}	
		
		
	}
}	
	
	
