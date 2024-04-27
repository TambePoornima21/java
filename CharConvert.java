class CharConvert
{
	public static void main(String[] args) 
	{
		convert(123);
		convert(87);
		convert('A');
		convert('Z');

	}

	public static void convert(int num)
	{
		if (num>=0 && num<=127)
		{
			System.out.println((char)num);
		}
		else
		{
			System.out.println("Cannot be Converted !!");	
		}
	}
}
