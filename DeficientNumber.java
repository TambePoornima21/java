class DeficientNumber
{
	public static void main(String[] args) 
	{
		int num=12;
			if (isDeficient(num))
			{
				System.out.println("It is a Deficient Number");
			}
			else
			{
				System.out.println("It is not a Deficient Number");
			}
	}

	public static boolean isDeficient(int num)
	{
			int sum=0;
			for (int i=1;i<=num/2 ;i++ )
			{
				if (num%i==0)
				{
					sum+=i;
				}
			}
			return sum<num;
		
	}
}
