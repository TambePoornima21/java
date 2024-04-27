import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int num=sc.nextInt();

		int count=0;
		int sum=0;
		for (int i=num; i!=0; i/=10 )
		{
			count++;
		}
			for (int i=num;i!=0 ;i/=10 )
			{
			
				int last=i%10;
				int pow=1;
				for (int j=0;j<count ;j++ )
				{
					pow=pow*last;
				}
				sum=sum+pow;
			}
			if (sum==num)
			{
				System.out.println("It is a Armstrong number");
			}
			else
			{
				System.out.println("It is not a Armstrong number");
			}
	}
}
