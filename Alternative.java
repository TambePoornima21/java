import java.util.Scanner;
class Alternative
{
	public static void main(String[] args) 
	{
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num=sc.nextInt();*/

		int start=1;
		int end=100;
		while (start<=end)
		{
			System.out.println(start);
			start+=2;
		}
	}
}
