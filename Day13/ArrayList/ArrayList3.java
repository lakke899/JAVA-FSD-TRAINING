package ArrayList;
import java.util.*;
public class ArrayList3 {
public static void main(String[] args) {
	ArrayList<String> sample = new ArrayList<String>();
	sample.add("Honda");
	sample.add("Skoda");
	sample.add("Maruthi");
	sample.add("Ferrari");
	for(String car:sample) {
		System.out.println(car);
	}
}
}
