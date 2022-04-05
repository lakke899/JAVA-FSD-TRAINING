package Polymorphism;

class School
{
	int students_no=300;
}
class Computers_class extends School
{
	int students_no=45;

}
class MethodOverriding3
{
	public static void main(String[] args)
	{
		School s=new Computers_class();// upcasting
		System.out.println(s.students_no);//300 (data members cannot be overriden)
		

	}
}