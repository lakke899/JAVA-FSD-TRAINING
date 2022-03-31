package Polymorphism;
//by implementing atleast 3 methods and by changing the type of arguments.


public class Overloading2EX {
	
	public void add(int a , int b) {
		System.out.println(a+b);
	}
	public void add(double a , double b) {
		System.out.println(a+b);
	}
	public void add(int a , double b , double c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading2EX obj = new Overloading2EX();
		obj.add(12, 15);
		obj.add(10.23, 15.45);
		obj.add(10, 13.56, 31.23);

	}

}
