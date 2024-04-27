import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();

		int n1=0;
		int n2=1;
		for (int i=1;i<=num ;i++ )
		{
			int n3=n1+n2;
			System.out.println(n1);
			n1=n2;
			n2=n3;
		}
	}
}
