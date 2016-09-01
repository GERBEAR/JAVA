package com.neiltomas;				//this is the name or the package. start of constructing a game face interaction
import java.io.Console;

	public class GameTimeCalc{
		public static void main(String[] args)throws Exception{
		

		Console con = System.console();

		String gameTag;
		String favGame;

		int hoursYear; 
		int hoursWeek;	
		int hoursDay;   

		System.out.print("Hi ");
		Thread.sleep(800);
		System.out.print("there!!\n\n");
		Thread.sleep(1200);
		gameTag = con.readLine("Can I ask you for your USER name please: \n");
		Thread.sleep(800);
					
		System.out.println("Thank you!!!  " + gameTag + "\n\n");
		Thread.sleep(800);
		
		System.out.println("Now, in order to continue, \n");
		Thread.sleep(400);
		System.out.println("I need to know your favorite game. Please let me know bellow: ");
		favGame = con.readLine("");
		Thread.sleep(1200);
		
		System.out.println("That is AWESOME!!! Your favorite game is the same as mine! I love " + favGame + "!!!\n");
		Thread.sleep(1000);
		System.out.println("I love " + favGame + "!!!\n");
		System.out.println("Can you give me a round estimate on how many hours a year you play " + favGame +" ???");

		hoursYear = Integer.parseInt(con.readLine(""));
		System.out.println("");
		Thread.sleep(1000);

		System.out.println("WAU!!! No way!!!\n\n\n");
		Thread.sleep(1000);

		hoursWeek = hoursYear / 52;
		hoursDay = hoursWeek / 7;

		System.out.println("Did you know that that turns out to " + hoursWeek + " hours a week!\n\n");
		Thread.sleep(600);
		System.out.println("And that further ammounts to " + hoursDay + " a day, which is \n\n");
		Thread.sleep(600);
		System.out.println("A LOT MAN!!!\n\n");
		Thread.sleep(600);
		System.out.println("Get a life!!!\n");

		

		
		
}

}