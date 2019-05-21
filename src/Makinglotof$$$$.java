import java.util.Scanner;

public class Makinglotof$$$$ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Asks the user for how many days they will work
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How many days you will work?");
		int days=keyboard.nextInt();
		
		//declare variable
		double total=0;
		//calculate some dollars
		
		for(int i=1;i<=days;i++)
		
		{
			//calculate how much you make today
			
			double salaryToday= Math.pow(2,i-1);
			System.out.println("Money on day:"+i+":"+salaryToday);

			//how much money u made in toTAL
			total=total+salaryToday;
			System.out.printf("\t Total so far:$ %.1f \n",total);
			
		}
		
		
		//Outputs the total amount earned at the end of the time period
		System.out.println("-------------");
		System.out.printf("Total dollars:$ %.2f \n",total);

	}

}
