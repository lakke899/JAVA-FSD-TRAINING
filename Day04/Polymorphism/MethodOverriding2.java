package Polymorphism;

	class Shape
	{
		void draw()
		{
			System.out.println("any shape can be drawn");
		}
	}
	class circle extends Shape
	{
		void draw()
		{
			System.out.println("circle shape can be drawn");
		}
	}
	class Triangle extends Shape
	{
		void draw()
		{
			System.out.println("Tiangle shape can be drawn");
		}
	}
	class Rectangle extends Shape
	{
		void draw()
		{
			System.out.println("Rectangle shape can be drawn");
		}
	}
	class MethodOverriding2
	{
		public static void main(String[] args)
		{
			Shape s=null;
			s=new Shape();
			s.draw();
			s=new circle();
			s.draw();
			s=new Triangle();
			s.draw();
			s=new Rectangle();
			s.draw();


		}
	}


