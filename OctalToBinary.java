class OctalToBinary
{
	public static void main(String[] args) 
	{
		System.out.println(octToBin(14));
	}

	public static String octToBin(int num)
	{
		String ans="";
		while (num!=0)
		{
			int rem=num%10;
			ans=rem+ans;
			num/=8;
		}
		return ans;
	}
}
