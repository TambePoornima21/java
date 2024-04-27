import java.util.Scanner;
class If2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();

		if(age>5){
			System.out.println("Pay for Ticket.");
		}
		else{
			System.out.println("Enter the park.");
		}
	}
}