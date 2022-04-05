package Super;

class Animals
{
	Animals()
	{
		System.out.println("animal class constructor is called");
	}
}
class SuperExmp3 extends Animals
{
	SuperExmp3()
	{
		super();
		System.out.println("sub class constructor is called");
	}
	public static void main(String[] args)
	{
		SuperExmp3 a=new SuperExmp3();
	}
}