package Inheritance;

//Heirarchial Inheritance
class Sounds
{
	void eat()
	{
	System.out.println("Animal is eating");
	}
}
class Hound extends Sounds
{
	void bark()
	{
	System.out.println("Dog is barking");
	}
}
class Cat extends Sounds{
	void meow()
	{
		System.out.println("Cat is meowing");
	}
}
class Testinheritance3
{
	public static void main(String[] args)
	{
		// syntax for creating a object
		// Class_name object_name=new Class_name();
		Cat obj=new Cat();
		obj.eat();
		obj.meow();
		//obj.bark();
	}
}