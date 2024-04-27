class MethodStrongNumber
{
	public static void main(String[] args) 
	{
		int num=175;
		int sum=factorial(num);
		if (num==sum)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}

	public static int factorial(int num)
	{
		int sum=0;
		for (int ip=num;ip!=0 ;ip/=10 )
		{
			int last=ip%10;
			int fact=1;
			for (int i=last;i>0 ;i-- )
			{
				fact*=i;
			}
			sum+=fact;
		}
		return sum;
	}
}
