class Start 
{
	public static void main(String[] args) 
	{
		int start=500;
		int end = 2000;
		while (start<=end)
		{
			if ((start/2)*2==start)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
