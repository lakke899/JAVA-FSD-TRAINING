package I_O_Streams;

import java.io.FileWriter;
import java.io.IOException;

public class SampleCreate {
public static void main(String[] args) throws IOException{
	String st="This is just some example content"+"for writing into a file";
	FileWriter f=new FileWriter("C:SampleOutputWriter.txt");
	for(int i=0; i<st.length();i++) {
		f.write(st.charAt(0));
	}
	System.out.println("Finished Writing");
	f.close();
}
}
