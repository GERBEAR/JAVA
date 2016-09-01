import java.io.Console;
public class Vehicle{
	public static void main(String[]args){
		Console con = System.console();
		//Ask a user to input the amount of money they have available for purchasing a new vehic
		
		int amountToPay = Integer.parseInt(con.readLine("Enter amount willing to pay for a Vehicle (between 5000 to 50000): "));
		
		// Then ask the user whether or not they prefer sports cars or family cars or motorbikes
		
		System.out.println("What do you prefer\n 1) Sports cars \n 2) family cars\n 3) motorbikes\n enter 1, 2 or 3 ");
		
		//Depending on their input display a customized list of vehicles to them, within their price range
		
		int vehicleType = Integer.parseInt(con.readLine("user entered: "));
		
		
		
		if(amountToPay >= 5000 && amountToPay<= 15000)
		{
			
			switch(vehicleType)
			{
			case 1:
			System.out.println(" sports cars within your price ranges are- RCC23, aston -martin and Ford Reclies");
			break;
			case 2:
			System.out.println("family cars within your price ranges are- Toyota Verso, Hyundai 2010(Peoples carriers) ");
			break;
			case 3:
			System.out.println("motorbikes - within your price ranges are- Vespa and Night rider");
			break;
			}
			
		}else if(amountToPay >15000 &&amountToPay < 20000)
		{
			switch(vehicleType)
			{
				case 1:
				System.out.println(" sports cars within your price ranges are- 2015 RCC23, 2012 aston martin, 2014 Ford Reclies");
			break;
			case 2:
			System.out.println("family cars within your price ranges are- Toyota Verso 2014, Hyundai 2015(Peoples carriers) ");
			break;
			case 3:
			System.out.println("motorbikes - within your price ranges are-BMW-Vespa and 2014Night-rider");
			break;
				
			}
			
			
		}else if(amountToPay>=20000 && amountToPay<=50000)
		{
			switch(vehicleType)
			{
				case 1:
				System.out.println(" sports cars within your price ranges are- 2016 RCC23, 2016aston martin, 2016 Ford Reclies");
			break;
			case 2:
			System.out.println("family cars within your price ranges are- Toyota Verso 2016, Hyundai 2016(Peoples carriers) ");
			break;
			case 3:
			System.out.println("motorbikes - within your price ranges are-BMWVespa2016 and 2016Night-rider");
			break;
				
			}
			
		}
		
		
	}	
}




//Your program should display a variety of vehicles between 5,000euros and 50,000euros.

