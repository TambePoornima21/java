import java.util.Scanner;
class TwistedPrime1
	{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);

	int num=sc.nextInt();
	int d=2;
	int n=num;
	while(d<n)
		{
		if(n%d==0)
		break;
		d++;
		}
		if(n==d){
			int rev=0;

				while(n!=0){
					int l=n%10;
					rev=rev*10+l;
					n/=10;
					}

			if(rev==num){
				System.out.println("Number is Twisted Prime");
			}
			else{
				System.out.println("Number is not twisted prime");
			}	
			
}
else{
System.out.println("Number is not prime");
	}

}
}