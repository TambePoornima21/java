class  CheckStrongNumber
{
	public class StrongNumber {
    public static void main(String[] args) {
        int num = 26332;
        if (fact(sumDigits(num)) == num) {
            System.out.println("Strong");
        } else {
            System.out.println("Not Strong");
        }
    }

    public static int fact(int num) {
        int fact = 1;
        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        return fact;
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
}
