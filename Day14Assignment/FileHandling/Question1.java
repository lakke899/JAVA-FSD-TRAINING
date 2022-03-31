package FileHandling;

import java.io.*;

//Write a program to create, write and read from a file.
public class Question1 {
public static void main(String[] args) {
	try {
	File file1 = new File("C:Hello.txt");
	System.out.println("File created with name : " +file1.getName());
	int len=(int) file1.length();
	PrintWriter pw = new PrintWriter(file1);
	pw.write("this is my content");
		pw.close();
		FileReader fr = new FileReader(file1);
		char[] x=new char[len];
		fr.read(x,0,len);
		String filecontent=new String(x);
		System.out.println(filecontent);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	
}
}