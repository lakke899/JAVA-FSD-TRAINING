package Exception;

/*1. Write a program to implement nested try-catch block for NUll Pointer exception
and NumberFormat Exception.*/
public class Question1 {
	public static void main(String[] args) {
		try
		{//outer try
			try//inner try
			{
				String S = null;
				System.out.println(S.length());
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			int a = Integer.parseInt(null);
		}//outer try closes
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}