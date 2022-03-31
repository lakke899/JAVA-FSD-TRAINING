package I_O_Streams;
import java.io.*;
public class SampleRead1 {
	public static void main(String[] args)throws IOException {
		File file1 =new File("C:SampleOutputWriter.txt");
		int len=(int) file1.length();
		try(FileReader fr=new FileReader(file1)){
			int c;
			while((c=fr.read())!=-1) {
				System.out.println((char)c);
			}
			}
		
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		catch(Exception e) {
			System.out.println(e);
		}
}

}
