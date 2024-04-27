class MethodPrime 
{
	public static void main(String[] args) 
	{
		System.out.println(checkPrime(16));
	}

	public static boolean checkPrime(int num)
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
