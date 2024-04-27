import java.util.Scanner;
class TwistedPrime
	{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num=sc.nextInt();
			int d;
			for(d=2;d<num;d++)
				{
				if(num%d==0)
					{
						break;
					}
				}
				if(d==num)
					{
						int rev=0;
						for(int i=num;i!=0;i/=10)
							{
								rev=rev*10+(i%10);
							}
			
				for(d=2;d<rev;d++){
				if(rev%d==0){
					break;
			}
			
			if(d==rev){

				
					System.out.println("Given number is a Twisted Prime Number");
			}
			else{
				System.out.println("Given number umber is not a Twisted Prime Number");
			}
			}
		
		else{
			System.out.println("This is not a Prime Number");
		}
	}
		}
}