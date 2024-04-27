import java.util.Scanner;
class BuzzRange
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number : ");
		int start=sc.nextInt();
		System.out.println("Enter end number : ");
		int end=sc.nextInt();

		
		for (int num=start ;num<=end ;num++ )
		{
		
		if (num%7==0 || num%10==7)
		{
			System.out.println(num);
		}
		}
		/*else
		{
			System.out.println("This number is not a Buzz number");
		}*/
	}
}
