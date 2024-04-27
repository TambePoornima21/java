import java.util.Scanner;
class Even
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String number : ");
		System.out.println("Enter the Ending number : ");
		int start=sc.nextInt();
		int end=sc.nextInt();

		while (start<=end)
		{
			if (start%2==0)
			{
				System.out.println(start);
			}
			start++;
		}
	}
}
