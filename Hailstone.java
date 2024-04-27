class  Hailstone
{
	public static void main(String[] args) 
	{
		int num=28;
		System.out.println(isHailstone(num));

	}

	public static int isHailstone(int num)
	{
		int count=0;
		while (num!=1)
		{
			if (num%2==0)
			{
				num=num/2;
			}
			else
			{
				num=num*3+1;
			}
			count++;
		}
		return count;
	}
}
