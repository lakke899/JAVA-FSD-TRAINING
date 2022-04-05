package Abstraction;
//abstract class with atleast 2 abstract methods and one non abstract method.
 abstract class A{
	 
	 void fun() // non abstract method
	 {
		 System.out.println("fun method");
	 }
	 abstract void display() ;// abstract method
	 abstract void base();// abstract method
	 
 }
  class B extends  A{

	@Override
	void display() {
		System.out.println("abstract method in class A");
	}

	@Override
	void base() {
		System.out.println("2nd abstract method in class A");
	}
 }
 class AbstractClass{
	 public static void main(String[] args) {
		B obj =new B();
		obj.display();
		obj.base();
		obj.fun();
	}
	 
 }