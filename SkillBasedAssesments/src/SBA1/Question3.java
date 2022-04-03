package SBA1;
//3.Create two arraylist of strings to take First_name and Last_name of the students,

//and print their whole name.

import java.util.*;

class firstname {
	String FirstName;

	firstname(String FirstName) {
		this.FirstName = FirstName;
	}
}

class lastname {
	String Lastname;

	lastname(String LastName) {
		this.Lastname = LastName;
	}
}

public class Question3 {
	public static void main(String[] args) {
		ArrayList<firstname> list1 = new ArrayList<firstname>();
		ArrayList<lastname> list2 = new ArrayList<lastname>();
		firstname s1 = new firstname("Sachin");
		firstname s2 = new firstname("mahindra singh");
		firstname s3 = new firstname("rahul");
		lastname a1 = new lastname("tendulkar");
		lastname a2 = new lastname("dhoni");
		lastname a3 = new lastname("dravid");
		list1.add(s1);
		list1.add(s2);
		list1.add(s3);
		list2.add(a1);
		list2.add(a2);
		list2.add(a3);
		Iterator itr1 = list1.iterator();
		Iterator itr2 = list2.iterator();
		while (itr1.hasNext() && itr2.hasNext()) {
			firstname obj1 = (firstname) itr1.next();
			lastname obj2 = (lastname) itr2.next();
			System.out.println(obj1.FirstName + " " + obj2.Lastname);
		}

	}
}
/*Sachin tendulkar
mahindra singh dhoni
rahul dravid
*/