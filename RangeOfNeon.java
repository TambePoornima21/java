import java.util.Scanner;
class  RangeOfNeon
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start range : ");
		int start=sc.nextInt();
		System.out.println("Enter end range : ");
		int end=sc.nextInt();
		

		int num=start;
		
		for (int i=num;num<=end ;num++ )
		{
			int sq=num*num;
			int sum=0;
		
		

		while (sq>0)
		{
			sum=sum+(sq%10);
			sq/=10;
		}
		if (sum==num)
		{
			System.out.println(num);
	}
		}
}
}

