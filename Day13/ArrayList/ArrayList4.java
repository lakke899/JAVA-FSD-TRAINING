package ArrayList;
import java.util.*;
public class ArrayList4 {
public static void main(String[] args) {
	ArrayList<String> sample = new ArrayList<String>();
	sample.add("Honda");
	sample.add("Skoda");
	sample.add("Maruthi");
	sample.add("Ferrari");
	System.out.println(sample.get(3));
	sample.set(2,"Renault");
	for(String car:sample) {
		System.out.println(car);
	}
}
}
