package ExceptionHandling;

import java.util.Scanner;

public class TryCatch {
public static void main(String[] args) {
	try {
		char[] array = new char[5];
		array[10]='b';
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
}
}
