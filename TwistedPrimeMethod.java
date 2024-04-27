class TwistedPrimeMethod
{
	public static void main(String[] args) 
	{
		int ip=91;
		if (isPrime(ip))
		{
			int rev=reverse(ip);
			if (isPrime(rev))
			{
				System.out.println("It is Twisted Prime Number");
			}
			else
			{
				System.out.println("It is not a Twisted Prime Number");
			}
		}
	}

	public static int reverse(int num)
	{
		int rev=0;
		while (num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}
	
	
	public static boolean isPrime(int num)
	{
		int i;
		for (i=2;i<=num ;i++ )
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
