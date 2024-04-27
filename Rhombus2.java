class Rhombus2
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i=0;i<n ;i++ )
		{
			for (int space=n ;space>n-i;space-- )
			{
				System.out.print(" "+" ");
			}
			for (int star=0;star<n ;star++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}
}

/*
* * * * *
  * * * * *
    * * * * *
      * * * * *
        * * * * *

		*/