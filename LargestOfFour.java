class LargestOfFour 
{
	public static void main(String[] args) 
	{
		int a = 26676;
		int b = 124567;
		int c = 978765;
		int d = 6787658;
		int ans = a>(b>(c>d?c:d)?b:(c>d?c:d))?a:(b>(c>d?c:d)?b:(c>d?c:d));
		System.out.println("The Largest of Four numbers is : "+ ans);
	}
 