class TwinPrime 
{
	public static void main(String[] args) 
	{
		int start=1;
		int end=100;
		int prime1=returnPrime(start);
		for (int i=prime1;i<=end ; )
		{
			int prime2=returnPrime(i+1);
				if (prime2-prime1==2)
				{
				System.out.println(prime1+" "+prime2);
				}
				prime1=prime2;
				i=prime2;
		}
	}

	public static int returnPrime(int num)
	{
		int den;
		for (int i=num; ;i++ )
		{
			boolean isPrime=true;
			for (den=2;den*den<=i ;den++ )
			{
				if (i%den==0)
				{
					isPrime=false;
					break;
				}
			}

			if (isPrime)
			{
				return i;
			}
		}
	}
}
