class StrongNumber 
{
	public static void main(String[] args) 
	{
		int start=1;
		int end=1000000;
		
		for (int num =start;num<=end;num++ )
		{
			int last=num%10;
			int fact=1;
			int sum=0;
			for (int i=last;i>0;i-- )
			{
				fact=fact*i;
				sum=sum+fact;
			}
			if (num==sum)
			{
				System.out.println(num);
			}
		}
	}
}
