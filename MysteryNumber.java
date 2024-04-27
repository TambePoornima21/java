class  MysteryNumber
{
	public static void main(String[] args) 
	{
		System.out.println(isMystery(170));
	}

	public static boolean isMystery(int num)
	{
		int n=11;
		while (true)
		{
			int rev=reverse(n);
			if (n+rev==num)
			{
				return true;
			}
			else if (n+rev<num)
			{
				n++;
			}
			else
			{
				return false;
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
}
