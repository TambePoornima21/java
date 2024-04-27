class SquareOfIndividualDigit 
{
	public static void main(String[] args) 
	{
		System.out.println(sum(1234));
	}

	public static int sum(int num)
	{
		int sum=0;
		while (num!=0)
		{
			int rem=extract(num);
			sum=sum+squareDigit(rem);
			num/=10;
		}
		 return sum;
	}

	public static int extract(int num)
	{
		int rem=num%10;
		return rem;
	}

	public static int squareDigit(int num)
	{
		int sq=num*num;
		return sq;
	}
}
