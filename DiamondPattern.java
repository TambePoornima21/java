class DiamondPattern 
{
	public static void main(String[] args) 
	{
		int n=5;
		int star=1; 
		int space=n/2;
		for (int j=0;j<space ;j++ )
		{
			System.out.print(" ");
		}
		for (int j=0;j<star ;j++ )
		{
			System.out.print("*");
			
		if (j<n/2)
		{
			space--;
			star+=2;
			
		}
		else
		{
			space++;
			star-=2;
		}
		
		
	
	}
}
}
