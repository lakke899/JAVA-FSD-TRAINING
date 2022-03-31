package Polymorphism;
class Parent{
	void method() {
		System.out.println("method in parent class");
	}
}
class Child1 extends Parent{
	void method() {
		System.out.println("method in child1 class");
	}
}
class Child2 extends Parent{
	void method() {
		System.out.println("method in child2 class");
	}
}

public class RunTimePolymorphism {

	public static void main(String[] args) {
		Parent P = null;
		P = new Parent();
		P.method();
		P = new Child1();
		P.method();
		P = new Child2();
		P.method();
	}

}
