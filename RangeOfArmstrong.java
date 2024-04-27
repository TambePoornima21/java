/*import java.util.Scanner;
class RangeOfArmstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start range : ");
		int start=sc.nextInt();
		System.out.println("Enter end range : ");
		int end=sc.nextInt();

		int sum=0;
		int count=0;
		
		

		for (int n=start;n!=0 ;n/=10 )
		{
			count++;
		}
		for (int i=start;i!=0 ;i/=10 )
		{
			int last=i%10;
			int pow=1;
		
		for (int j=0;j<count ;j++ )
		{
			pow=pow*last;
			
		}
		sum=sum+pow;
		}
		if (sum==start)
		{
			System.out.println(start);
		}
	}
}*/
import java.util.Scanner;

class RangeOfArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start range : ");
        int start = sc.nextInt();
        System.out.println("Enter end range : ");
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {
            int sum = 0;
            int count = 0;
            int temp = num;

            // Count the number of digits in the current number
            while (temp != 0) {
                temp /= 10;
                count++;
            }

            // Reset temp to the original value
            temp = num;

            // Calculate the sum of digits raised to the power of their position
            while (temp != 0) {
                int last = temp % 10;
                int pow = 1;

                for (int j = 0; j < count; j++) {
                    pow *= last;
                }

                sum += pow;
                temp /= 10;
            }

            // Check if the current number is an Armstrong number and print it
            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

