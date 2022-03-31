package Inheritance;

class M{
	void method_1() {
		System.out.println("method 1 in class M");
	}
}
class N extends M{
	void method_2() {
		System.out.println("method 2 in class N");
	}
}
class K extends M{
	void method_3() {
		System.out.println("method 3 in class K");
	}
}

public class HirarchialInheritance {

	public static void main(String[] args) {
		N obj = new N();
		K obj1 = new K();
		obj.method_1();
		obj.method_2();
		obj1.method_1();
		obj1.method_3();
	}

}
