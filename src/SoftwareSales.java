import java.util.Scanner;

public class SoftwareSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ask the user for input
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How many software do u want?");
		int numSoftware=keyboard.nextInt();
		//how many softwares do you want?
		double discount=0;
		if(numSoftware>=10 && numSoftware<19)
		{
			//discount 20%
			discount=0.20;
		}
		else if(numSoftware>=20 && numSoftware<49){
			//discount 30%
			discount=0.30;
			
		}
else if(numSoftware>=50 && numSoftware<99){
	//discount 40%
	discount=0.40;
	
		}
else if(numSoftware>=100)
{
	//discount 50%
	discount=0.50;
}
		
		double subtotal= 99*numSoftware;
		double discountAmount=subtotal*discount;
				double finalAmount=subtotal-discountAmount;
				//show the output
				System.out.println("Subtotal:$"+subtotal);
				System.out.println("discount:$"+discount);
				//System.out.println("finalAmount:$"+finalAmount);
//rounded to 2 decimal points
				
				System.out.printf("Final price: %.2f",finalAmount);		
	}

}
