class  Modulus
{
	public static void main(String[] args) 
	{
		byte b1=41;
		byte b2=3;
		int b3 = b1%b2;
		System.out.println(b3);

		short s1=129;
		short s2=4;
		int s3=s1%s2;
		System.out.println(s3);

		int i1=123;
		int i2=234;
		int i3=i1%i2;
		System.out.println(i3);


		long l1=12345l;
		long l2=12l;
		long l3=l1%l2;
		System.out.println(l3);

		float f1=1.2f;
		float f2=1.23f;
		float f3=f1%f2;
		System.out.println(f3);

		double d1=2.23d;
		double d2=1.55d;
		double d3=d1%d2;
		System.out.println(d3);

		char ch1='A';
		char ch2='C';
		int ch3=ch1%ch2;
	}
}
