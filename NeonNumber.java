import java.util.Scanner;
class  NeonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();

		int sq=num*num;
		int sum=0;

		while (sq>0)
		{
			sum=sum+(sq%10);
			sq/=10;
		}
		if (sum==num)
		{
			System.out.println("The given number is a Neon Number");
		}
		else
		{
			System.out.println("The given number is not a Neon Number");
		}
	}
}
