import java.util.Scanner;
class IfElse3
{
	public static void main(String[] args) 
	{
		Scanner  sc= new Scanner(System.in);
		System.out.println("Enter the amount ot be transferred : ");
		double amount=sc.nextDouble();
		double limit=20000.0;

		if(amount<=limit){
			System.out.println("Money can be transferred");
		}
		else{
			System.out.println("Money cannot be transffered");
		}
	}
}
