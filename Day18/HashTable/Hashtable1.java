package HashTable;
import java.util.*;
public class Hashtable1 {

	public static void main(String[] args) {
		Hashtable<Integer,String> HT=new Hashtable<Integer,String>();
		HT.put(100, "Amith");
		HT.put(102, "Ravi");
		HT.put(101, "Vijay");
		HT.put(103, "Rahul");
		for(Map.Entry m:HT.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
