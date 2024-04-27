import java.util.Scanner;
class Tables
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();

		int start=1;
		while (start<=100)
		{
			System.out.println(num+" * "+start+" = "+(num*start));
			start++;
		}
	}
}
