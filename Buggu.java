class Buggu 
{
	public static void main(String[] args) 
	{
		int ver=5;
		int hor=35;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();


		for (int i=0;i<ver ;i++ )
		{
			for (int j=0;j<hor ;j++ )
			{
				if (i<5&&j==0||i==1&&j==1||i==2&&j==2||i==1&&j==3||j==4&&i<5||i<5&&j==6||i<5&&j==9||i==0&&j==7||i==0&&j==8||i==2&&j==7||i==2&&j==8||i==0&&j==11||i==1&&j==12||i==2&&j==13||i==1&&j==14||i==0&&j==15||i==3&&j==13||i==4&&j==13||i<5&&j==17||i==4&&j==18||i==4&&j==19||i<5&&j==20||i<5&&j==22||i==0&&j==23||i==0&&j==24||i==2&&j==23||i==2&&j==24||i==3&&j==23||i==4&&j==24||i==1&&j==24||i<2&&j==27||i<3&&j==28||i==1&&j==29||i==2&&j==29||i==3&&j==29||i>1&&j==30||i==3&&j==31||i==2&&j==31||i==1&&j==31||j==32&&i<3||j==33&&i<2)
				{
					System.out.print("M"+" ");
				}
				else
				{
					System.out.print(" "+" ");
				}
			}
					System.out.println();

		}
	}
}
