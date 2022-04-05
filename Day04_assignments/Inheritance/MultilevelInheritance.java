package Inheritance;

class X{
	void Method1() {
		System.out.println("method1 in class x");
	}
}
class Y extends X{
	void Method2() {
		System.out.println("method 2 in class y");
	}
}
class Z extends Y{
	void Method3() {
		System.out.println("method3 in class z");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Z obj = new Z();
		obj.Method1();
		obj.Method2();
		obj.Method3();
	}

}
