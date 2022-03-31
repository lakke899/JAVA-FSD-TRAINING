package ExceptionHandling;

public class TryMultipleCatch {
public static void main(String[] args) {
	try {
		int num = Integer.parseInt("Raj");
		System.out.println(num);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	catch(NullPointerException e) {
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
