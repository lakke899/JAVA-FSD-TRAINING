package Polymorphism;

//by implementing atleast 3 methods and by changing the number of arguments.


public class Overloadin1EX {
	
	public void add(int a , int b) {
		
		System.out.println(a+b);
	}
	
	public void add(int a , int b, int c) {  // overload method
		
		System.out.println(a+b+c) ;
	}
	
	public void add(int a , int b , int c , int d) {   // overload method
		
		System.out.println(a+b+c+d) ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadin1EX obj = new Overloadin1EX();
		obj.add(5, 7);
		obj.add(10, 20, 15);
		obj.add(12, 15, 13, 22);

	}

}

