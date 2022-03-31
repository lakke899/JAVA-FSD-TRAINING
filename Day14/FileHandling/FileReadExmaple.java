package FileHandling;
import java.io.*;
import java.util.*;
public class FileReadExmaple {
public static void main(String[] args) {
	try {
		File f1 = new File("C:FileCreateExample.txt");
		Scanner sc = new Scanner(f1);
		while(sc.hasNext()) {
			String fileData=sc.nextLine();
			System.out.println(fileData);
		}
		sc.close();
	}
	catch(Exception e) {
		System.out.println("There is some unexpected Problem");
		System.out.println(e);
	}
}
}
