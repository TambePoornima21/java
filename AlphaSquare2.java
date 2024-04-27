class AlphaSquare2
{
	public static void main(String[] args) 
	{
		int n=5;
		char ch='a';
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				System.out.print((char)(i+65)+" ");
	
			}
			ch++;
			System.out.println();
		}
		
	}
}

/*
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
*/