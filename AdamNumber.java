class AdamNumber 
{
	public static void main(String[] args) 
	{
		int num=51;
		int a=square(num);
		int b=square(reverse(num));
		if (a==reverse(b))
		{
			System.out.println("It is Adam number");
		}
		else
		{
			System.out.println("It is not Adam number");
		}
		
	}

	/*public static boolean isAdam(int num)
	{
		if (square(num)==(square(reverse(num))))
		{
			System.out.println("It is Adam number");
			return true;
		}
		else
		{
			return false;
		}
	}*/

	/*public static void isAdam(int num)
	{
		if (a==reverse(b))
		{
			System.out.println("It is Adam number");
		}
		else
		{
			System.out.println("It is not Adam number");
		}
	}*/


	public static int square(int num)
	{
		int sq=num*num;
		return sq;
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
