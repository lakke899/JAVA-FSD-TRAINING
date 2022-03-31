package Polymorphism;
// changing the type of arguments
class Test1{
	void Mul(int a, int b) {
		System.out.println("mul "+(a*b));
	}
	void Mul(int a, double b, int c) {
		System.out.println("mul "+(a*b*c));
	}
	void Mul(double a, int b, int c, double d ) {
		System.out.println("mul "+(a*b*c*d));
	}
}
public class MethodOverloading2 {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.Mul(10, 10);
		obj.Mul(10, 10.5, 10);
		obj.Mul(10.5, 10, 10, 10.5);
	}

}
