package Polymorphism;

public class MethodOverload1 {
	//by changing the number of arguments

		static void add(int a,int b)
		{
			System.out.println(a+b);
		}
		static void add(int a,int b,int c)
		{
			System.out.println(a+b+c);
		}
		public static void main(String args[])
		{
			add(11,12);
			add(100,200,600);
		}
	

}
