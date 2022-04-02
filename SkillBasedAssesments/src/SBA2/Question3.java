package SBA2;

import java.io.File;
//Write a program to get the information about the file.
import java.lang.*;

public class Question3 {
	public static void main(String[] args) {
		File file1 = new File("C:Hello.txt");
		if (file1.exists()) {
			System.out.println(" File Name : " + file1.getName());
			System.out.println(" File Path : " + file1.getAbsolutePath());
			System.out.println(" File Writable : " + file1.canWrite());
			System.out.println(" File Seadable : " + file1.canRead());
			System.out.println(" File Size : " + file1.length());
		} else {
			System.out.println("file does not exists");
		}
	}
}
/* OUTPUT
File Name : Hello.txt
File Path : C:\Users\lakke\eclipse-workspace\SkillBasedAssesments\Hello.txt
File Writable : true
File Seadable : true
File Size : 18
*/