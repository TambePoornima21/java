import java.util.Scanner;
class  PronicNumber
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();
		

		boolean ispronic=false;
		for (int i=1;i<=num-1 ;i++ )
		{
			if (i*(i+1)==num)
			{
				ispronic=true;
				break;
			}
	
		}
		if (ispronic)
		{
			System.out.println("This is a pronic number");
		}
		else
		{
			System.out.println("This is not a pronic number");
		}


	}
}
