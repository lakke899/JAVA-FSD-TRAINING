package Polymorphism;
// changing the number of arguments
class Test{
	void add(int a, int b) {
		System.out.println("sum "+(a+b));
	}
	
	void add(int a,int b,int c) {
		System.out.println("sum "+(a+b+c));
	}
	void add(int a, int b, int c, int d) {
		System.out.println("sum "+(a+b+c+d));
	}
}

public class MethodOverloading1 {

	public static void main(String[] args) {
		Test obj = new Test();
		obj.add(10, 20);
		obj.add(10, 20, 30);
		obj.add(10, 20, 30, 40);
		
	}

}
