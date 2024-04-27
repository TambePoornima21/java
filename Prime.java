class Prime 
{
	public static void main(String[] args) 
	{
		int num=27; //numerator
		int den=2; //denomemator
		while (den<num)
		{
			if (num%den==0)
			{
				break;
			}
			den++;
		}
		if (num==den)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("IT is not a Prime Number");
		}
	}
}
