public class grossSalary{
	public static void main(String[] args){
		
		//int salary = 500;
		//System.out.println(salary);

		float salary = 550.50f;
		
		int tax = 21;

		float totalTax = ( salary / 100 ) * tax;

		float net = salary - totalTax;

			System.out.println("My netSalary is € " + net);
	}
}

		
	