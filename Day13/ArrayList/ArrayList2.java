package ArrayList;
import java.util.*;
public class ArrayList2 {
public static void main(String[] args) {
	ArrayList<String> sample = new ArrayList<String>();
	sample.add("Honda");
	sample.add("Skoda");
	sample.add("maruthi");
	sample.add("Ferrari");
	Iterator itr = sample.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
}
