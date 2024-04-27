import java.util.Scanner;
class SwitchStatement
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("1.Monday");
		System.out.println("2.Tuesday");
		System.out.println("3.Wednesday");
		System.out.println("4.Thursday");
		System.out.println("5.Friday");
		System.out.println("6.Saturday");
		System.out.println("7.Sunday");
		System.out.println("Enter you choice : ");
		int choice=sc.nextInt();
		switch(choice){
			case 1 : System.out.println("English");
			break;
			case 2 : System.out.println("Science");
			break;
			case 3 : System.out.println("Maths");
			break;
			case 4 : System.out.println("History");
			break;
			case 5 : System.out.println("Marathi");
			break;
			case 6 : System.out.println("Geography");
			break;
			case 7 : System.out.println("Enjoy and play");
			break;
			default : System.out.println("Enter valid choice : ");
		}

	}
}
