package ArrayList;
//User-defined class objects in Java ArrayList
import java.util.*;
class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
public class ArrayList5 {
public static void main(String[] args) {
	//Creating user-defined class objects 
	Student S1=new Student(101,"Sonoo",24);
	Student S2 = new Student(102,"Ravi",21);
	Student S3 = new Student(103,"Hanumath",25);
	////creating arraylist
	ArrayList<Student> A1= new ArrayList<Student>();
	A1.add(S1);  //adding Student class object 
	A1.add(S2);
	A1.add(S3);
	//Getting Iterator
	Iterator itr = A1.iterator();
	//traversing elements of ArrayList object
	while(itr.hasNext()) 
	{
		Student st =(Student) itr.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
}
}
