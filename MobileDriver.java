class MobileDriver 
{
	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile();

		m1.screen=6.6;
		m1.camera=54.3; 
		m1.processor= "snapdragon 680"; 
		m1.network="5G";
		m1.speaker="Boat 580";
		m1.battery="6000 mah";
		m1.model="Redmi 12 pro";

		System.out.println(m1);
		System.out.println("Screen : "+m1.screen);
		System.out.println("Camera: "+m1.camera);
		System.out.println("Processor : "+m1.processor);
		System.out.println("Network : "+m1.network);
		System.out.println("Speaker : "+m1.speaker);
		System.out.println("Battery : "+m1.battery);
		System.out.println("Model : "+m1.model);

	}
}
