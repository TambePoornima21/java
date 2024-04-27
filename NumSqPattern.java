class NumSqPattern 
{
	public static void main(String[] args) 
	{
		int n=4;
		int val=1;
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				System.out.print((val+i)+" ");
				val+=n;
				
			}
			val=1;
			System.out.println();
		}
	}
}

/*
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16
*/
