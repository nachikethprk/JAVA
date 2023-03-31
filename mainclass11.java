package abstraction;


	class bike{
		void sound()
		{
			System.out.println("some sound");
		}}
	class yamaha extends bike{
		void sound()
		{
			System.out.println("drrrr");
		}}
	class BMW extends bike
	{
		void sound()
		{
			System.out.println("brrrrr");
		}}
	class pulsar extends bike
	{
		void sound()
		{
			System.out.println("trrrr");
		}}
	class Stimulator
	{
		static void vehicle(bike a1)
		{
			a1.sound();
		}}

	public class mainclass11 {
		public static void main(String[]args){
			yamaha y1=new yamaha();
			BMW b1=new BMW();
			pulsar p1=new pulsar();
			Stimulator.vehicle(y1);
			Stimulator.vehicle(b1);
			Stimulator.vehicle(p1);
		}
	}
}
