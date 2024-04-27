class  SmithNumber
{
	public static void main(String[] args) 
	{
		int num=85;
		int den=2;
		int sum=0;
		int a1=sumOfDigits(num);
		while (num!=1)
		{
			if (num%den==0)
			{
				num/=den;
				if (isPrime(den))
				{
					sum+=sumOfDigits(den);
					den=2;
				}
			}
			else
			{
				den++;
			}
		}
		if(sum==a1)
			System.out.println("Smith number");
		else
			System.out.println("Not a smith number");

	}

	public static int sumOfDigits(int num)
	{
		int sum=0;
		while (num!=0)
		{
			sum=sum+num%10;
			num/=10;
		}
		return sum;
	}

	public static boolean isPrime(int num)
	{
		int i;
		for (i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				break;
			}
		}
		if (num==i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
