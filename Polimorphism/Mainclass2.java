package polymorphism11;

class tea
{
	void taste()
	{
		System.out.println("soopeer");
	}
}

class lemontea extends tea
{
	void taste()
	{
		System.out.println("woww");
	}
}

class blacktea extends tea
{
	void taste()
	{
		System.out.println("wawww");
	}
}

class greentea extends tea
{
	void taste()
	{
		System.out.println("nice");
	}
}

class Stimulator
{
	static void teataste(tea a1)
	{
		a1.taste();
	}
}

public class Mainclass2
{
	public static void main(String[]args)
	{
		lemontea y1=new lemontea();
		blacktea b1=new blacktea();
		greentea p1=new greentea();
		
		Stimulator.teataste(y1);
		Stimulator.teataste(b1);
		Stimulator.teataste(p1);
	}

}