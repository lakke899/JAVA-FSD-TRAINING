package Exception;
//2.Write a program to implement try catch block for String Index Out of Bounds.
public class Question2 {
public static void main(String[] args) {
	try {
		String S = "Hello how are you?";
		System.out.println(S.charAt(20));
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}
