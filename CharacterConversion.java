class CharacterConversion 
{
	public static void main(String[] args) 
	{
		convert('A');
		convert('z');
	}

	public static void convert(char ch)
	{
		if (ch>='a' && ch<='z')
		{
			char ans =(char)(ch-32);
			System.out.println(ans);
		}
		else
		{
			char ans= (char)(ch+32);
			System.out.println(ans);
		}
	}
}
