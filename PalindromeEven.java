class PalindromeEven 
{
	public static void main(String[] args) 
	{
		int ip=212;
		int ans=reverse(ip);

		if (checkPalindrome(ip,ans) && checkEven(ip))
		{
			System.out.println("It is a Palindromic Even Number");
		}
		else
		{
			System.out.println("It is not a Palindromic Number");
		}
	}

	public static int reverse(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}

	public static boolean checkPalindrome(int ip, int rev)
	{
		return ip==rev;
	}

	public static boolean checkEven(int num)
	{
		return num%2==0;
	}
}
