class PascalTriangle 
{
	public static void main(String[] args) 
	{
		pascalTriangle(7);
	}

	public static int formula(int n,int r)
	{
		return factorial(n)/(factorial(n-r)*factorial(r));
	}

	public static int factorial(int num)
	{
		int fact=1;
		while (num>0)
		{
			fact=fact*num;
			num--;
		}
		return fact;
	}

	public static void pascalTriangle(int n)
	{
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n-i;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int j=0;j<=i ;j++ )
			{
				System.out.print(formula(i,j)+"   ");
			}
			System.out.println();
		}
	}
}
