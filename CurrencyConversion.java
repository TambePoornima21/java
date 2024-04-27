class CurrencyConversion 
{
	public static void main(String[] args) 
	{
		rupeeToDollar(100);
	}

	public static void rupeeToDollar(double rupee)
	{
		double dollar=rupee/82.92;
		System.out.println(dollar);
		dollarToDihrams(dollar);
	}

	public static void dollarToDihrams(double dollar)
	{
		double dihrams=dollar*3.67;
		System.out.println(dihrams);
		//dollarToDihrams(euro);
	}

	public static void dihramsToEuro(double dihrams)
	{
		double euro=dihrams/4;
		System.out.println(euro);
		//dihramsToEuro();
	}
}
