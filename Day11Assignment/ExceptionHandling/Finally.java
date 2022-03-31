package ExceptionHandling;
class ListOfNumbers {
	  public int[] arr = new int[10];

	  public void writeList() {

	    try {
	      arr[10] = 11;
	    }
	    catch (IndexOutOfBoundsException e2) {
	      System.out.println("IndexOutOfBoundsException => " + e2.getMessage());
	    }
	    finally {
	    	System.out.println("finally");
	    }

	  }
	}

public class Finally {
public static void main(String[] args) {
	ListOfNumbers list = new ListOfNumbers();
    list.writeList();
}
}
