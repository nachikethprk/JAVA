package polymorphism11;

class Ticket {
	void pay() {
		System.out.println("book your tickets");
	}
}

class bus extends Ticket {
	void pay() {
		System.out.println("bus ticket booked");
	}
}

class train extends Ticket {
	void pay() {
		System.out.println("train tickets booked");
	}
}

class aero extends Ticket {
	void pay() {
		System.out.println("aeroplane tickets booked");
	}
}

 class Stim {
	static void tick(Ticket t1) {
		t1.pay();
	}
}

public class mainpaytm {
	public static void main(String[] args) {
		bus b1 = new bus();
		train t1 = new train();
		aero a1 = new aero();

		Stim.tick(t1);
		Stim.tick(a1);
		Stim.tick(b1);
	}
}
