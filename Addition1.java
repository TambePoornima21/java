class Addition1
{
	public static void main(String[] args) 
	{
		add(15,16);
		power(12,4);
		divide(10,2);
	}

	public static void add(int a, int b)
	{
		int res = a + b ;
		System.out.println(res);
	}

	public static void power(int a, int b)
	{
		int pow=1;
		for (int i=0;i<b ;i++ )
		{
			pow*=a;
		}
		System.out.println(pow);
	}

	public static void divide(double a, double b)
	{
		double res=a/b;
		System.out.println(res);
	}
}
