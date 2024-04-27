class LengthConversion 
{
	public static void main(String[] args) 
	{
		meterToCentimeter(100);
	}

	public static void meterToCentimeter(double m)
	{
		double cm=m*100;
		System.out.println(cm);
		centimeterToInch(cm);
	}

	public static void centimeterToInch(double cm)
	{
		double inch=cm/2.54;
		System.out.println(inch);
		inchToFoot(inch);
	}

	public static void inchToFoot(double inch)
	{
		double foot=inch*12;
		System.out.println(foot);
		footToKilometer(foot);
	}

	public static void footToKilometer(double foot)
	{
		double km=foot*3281;
		System.out.println(km);
	}
}




/*m -> cm
cm-> inch
inch -> foot
foot -> km*/
