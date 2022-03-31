package Inheritance;


class Tables {
	void move() {
		System.out.println("Table is moving");
	}
}
class Chairs extends Tables {
	void sit() {
		System.out.println("We can sit in chair");
	}
	
}
class Desk extends Chairs {
	void stand() {
		System.out.println("We can stand on table");
	}
}
public class MultilevelEX {

	public static void main(String[] args) {
		Desk dk= new Desk();
		dk.stand();
		dk.sit();
		dk.move();
	}

}
