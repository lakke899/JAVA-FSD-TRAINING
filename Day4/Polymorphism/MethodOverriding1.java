package Polymorphism;

	class Bike
	{
		void run()
		{
			System.out.println("Bike is running");
		}
	}
	class Honda extends Bike
	{
		void run()
		{
			System.out.println("Honda is running");
		}
	}
	class MethodOverriding1
	{
		public static void main(String[] args)
		{
			Bike obj=new Honda();
			obj.run();
		}
	}


