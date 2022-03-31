package ArrayList;
/*Create two arraylist of strings to take First_name and Last_name of the students,
and print their whole name.*/
import java.util.*;
class first{
	String FirstName;
	first(String FirstName){
	this.FirstName=FirstName;	
	}
}
class last{
	String Lastname;
	last(String LastName){
		this.Lastname=LastName;
	}
}
public class Question3{
	public static void main(String[] args) {
		ArrayList<first> list1=new ArrayList<first>();
		ArrayList<last> list2=new ArrayList<last>();
		first s1 = new first("Sachin");
		first s2 = new first("mahindra singh");
		first s3 = new first("rahul");
		last a1 = new last("tendulkar");
		last a2 = new last("dhoni");
		last a3 = new last("dravid");
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list2.add(a1);
		list2.add(a2);
		list2.add(a3);
		Iterator itr1=list1.iterator();
		Iterator itr2=list2.iterator();
		while(itr1.hasNext()&&itr2.hasNext()) {
			first obj1 =(first)itr1.next();
			last obj2=(last)itr2.next();
			System.out.println(obj1.FirstName+" "+obj2.Lastname);
		}
	
	}	
}