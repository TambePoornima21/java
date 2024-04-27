class BookDriver 
{
	public static void main(String[] args) 
	{

		Book b1 = new Book();

		b1.pages=200;
		b1.type="Notebook";
		b1.brand="Camlin";
		b1.binding="HardBinding";

	
		System.out.println(b1);
		System.out.println("Pages :"+b1.pages);
		System.out.println("Type : "+b1.type);
		System.out.println("Brand : "+b1.brand);
		System.out.println("Binding : "+b1.binding);
	}
}
