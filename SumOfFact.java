import java.util.Scanner;
class SumOfFact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();

		int sum=0;

		while (num!=0)
		{
			int last=num%10;
			int fact=1;
			for (int i=last;i>0 ;i-- )
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num/=10;
		}
		System.out.println(sum);

	}
}
