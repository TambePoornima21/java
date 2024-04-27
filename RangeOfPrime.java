/*import java.util.Scanner;
class  RangeOfPrime
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Start Range : ");
		int start=sc.nextInt();
		System.out.println("Enter End Range : ");
		int end=sc.nextInt();

		while (start<=end)
		{
			int den=2;
			while (den<start)
			{
				if (start%den==0)
				{
					break;
				}
				den++;
			}
			if (start==den)
			{
				System.out.println(start);
				start++;
			}
		}
	}
}*/
import java.util.Scanner;

class RangeOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Start Range : ");
        int start = sc.nextInt();
        System.out.println("Enter End Range : ");
        int end = sc.nextInt();

        while (start <= end) {
            int den = 2;
            boolean isPrime = true; // Flag to check if a number is prime

            while (den < start) {
                if (start % den == 0) {
                    isPrime = false;
                    break;
                }
                den++;
            }

            if (isPrime) {
                System.out.println(start);
            }

            start++;
        }
    }
}
