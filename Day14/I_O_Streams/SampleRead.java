package I_O_Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SampleRead {
public static void main(String[] args) throws IOException{
	File file1=new File("C:SampleOutputWriter.txt");
	int len=(int) file1.length();
	try(FileReader fr = new FileReader(file1)){
		char[] x=new char[len];
		fr.read(x,0,7);
		String filecontent=new String(x);
		System.out.println(filecontent);
	}
	catch(FileNotFoundException e){
		System.out.println("File Not Found");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}
