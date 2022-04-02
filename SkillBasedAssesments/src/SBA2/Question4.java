package SBA2;

//Write a program Implement the filereader until the file ending character is “-1” and print all the data of the file.
import java.io.*;

public class Question4 {
	public static void main(String[] args) {
		File file = new File("C:Hello.txt");
		try (FileReader fr = new FileReader(file)) {
			int content;
			while ((content = fr.read()) != -1) {
				System.out.print((char) content);
			}
		} catch (FileNotFoundException e) {
			System.out.println("error");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
/*
OUTPUT
this is my content
*/