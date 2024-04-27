class NumSqPattern2 
{
	public static void main(String[] args) 
	{
		int n=4;
		int num =1;
		for (int i=1;i<=n ;i++ )
		{
			int temp=num;
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(temp+" ");
				temp+=n-j;
				
			}
			
			System.out.println();
			num++;
		}
	}
}

/*
1
2 5
3 6 8
4 7 9 10
*/
