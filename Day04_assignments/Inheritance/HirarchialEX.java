package Inheritance;

class Bird
{
	void eat()
	{
	System.out.println("Bird is eating");
	}
}
class Parrot extends Bird
{
	void squawk()
	{
	System.out.println("Parrot is squawking");
	}
}
class Peacock extends Bird{
	void scream()
	{
		System.out.println("Peacock is screaming");
	}
}
class HeirarchialEX
{
	public static void main(String[] args)
	{
		Parrot obj=new Parrot();
		obj.eat();
		obj.squawk();
	}
}
