class RotatingNumber 
{
	public static void main(String[] args) 
	{
		int num=113;
		int temp=num;
		if (isPrime(num))
		{
			num=rotate(num);
			while (temp!=num)
			{
				if (!isprime)
				{
					break;
				}
				num=rotate(num);
			}
			if (num==temp)
			{
				System.out.println("Rotating Prime Number");
			}
			else
			{
				System.out.println("Not a Rotating Prime Number");
			}
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
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

	public static int rotate(int num)
	{
		
	}
}
