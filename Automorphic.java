class Automorphic 
{
	public static void main(String[] args) 
	{
		int start=1;
		int end=10000;
		while (start<=end)
		{
			if (isAutomorphic(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}

	public static boolean isAutomorphic(int num)
	{
		return ((num*num)%power(10,count+(num))==num);
	}

	public static int count(int num)
	{
		int ct=0;
		while (num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}

	public static int power(int base, int raise)
	{
		int pow=1;
		for (int i=raise;i>0 ;i-- )
		{
			pow*=base;
		}
		return pow;
	}
}
