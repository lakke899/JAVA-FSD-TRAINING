package Inheritance;
class A{
	void method1() {
		System.out.println("Method 1 in class A");
	}
}
class B extends A{
	void method2() {
		System.out.println("method 2 in class B");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		B obj = new B();
		obj.method1();
		obj.method2();
	}

}
