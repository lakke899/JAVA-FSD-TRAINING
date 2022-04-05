package Final;

public class FinalExmp1
{
	 int a=5;
	void test()
	{
		a=350;// we can't change anything 
		System.out.println("a value after changing="+a);
	}
	public static void main(String[] args)
	{
		FinalExmp1 a=new FinalExmp1();
		System.out.println("a ="+a);
		a.test();
	}
}
