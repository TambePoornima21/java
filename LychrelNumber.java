class LychrelNumber 
{
	public static void main(String[] args) 
	{
		int num=196;
		if (isLychrel(num))
		{
			System.out.println("Lychrel number");
		}
		else
		{
			System.out.println("Not a Lychrel number");
		}
		
	}

	public static boolean isLychrel(int num)
	{
		num=num+reverse(num);
		if (isPalindrome(num))
		{
			return false;
		}
		return true;
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

	public static boolean isPalindrome(int num) {
        int reversed = reverse(num);
        return num == reversed;
    }
}
