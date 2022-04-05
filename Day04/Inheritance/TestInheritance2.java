package Inheritance;

//multilevel inheritance
class Creature
{
	void eat()
	{
	System.out.println("Animal is eating");
	}
}
class Lion extends Creature
{
	void roar()
	{
	System.out.println("Lion is Roaring");
	}
}
class Puppy extends Lion{
	void weeping()
	{
		System.out.println("Puppy is weeping");
	}
}
class TestInheritance2
{
	public static void main(String[] args)
	{
		// syntax for creating a object
		// Class_name object_name=new Class_name();
		Puppy obj=new Puppy();
		obj.weeping();
		obj.roar();
		obj.eat();
	}
}