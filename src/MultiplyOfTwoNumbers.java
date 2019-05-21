import java.util.Scanner;

public class MultiplyOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get number from user
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=keyboard.nextInt();
		//add the numbers
		int total= 1;
		
		
		//multiply
		for(int i=1;i<=number;i++){
			total=total*i;
		}
		
		//output
		System.out.println("The total is:"+total);
		
	}

}
