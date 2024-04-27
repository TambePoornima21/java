class BinaryToDecimal 
{
	public static void main(String[] args) 
	{
		System.out.println(binToDec(10101));
	}

	public static int binToDec(int num)
	{
		int sum=0;
		for (int i=0;num!=0 ;i++,num/=10 )
		{
			int last=num%10;
			sum=sum+(last*power(2,i));
		}
		return sum;
	}

	public static int power(int rem,int count)
	{
	int pow=1;
	for (int i=count;i>0 ;i-- )
	{
		pow*=rem;
	}
	return pow;
	}
}
