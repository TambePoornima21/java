class SunnyNumber 
{
	public static void main(String[] args) 
	{
		int num=90;
		System.out.println(isSunny(num));

	}
	public static boolean isSunny(int num)
	{
		num=num+1;
		for (int n=1;n*n<=num ;n++ )
		{
			if (n*n==num)
			{
				return true;
			}
			
		}
		return false;
		
	}
	
}
