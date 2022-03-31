package Abstraction;
//interface with atleast 2 methods
interface X{
	void display();
	void show();
}
class Y implements X{

	@Override
	public void display() {
		System.out.println("Display method");
	}

	@Override
	public void show() {
		System.out.println("show method");
	}
	
}

public class InterfaceAssign {

	public static void main(String[] args) {
		Y obj = new Y();
		obj.display();
		obj.show();
		
		
	}

}
