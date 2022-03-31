package ExceptionHandling;
public class NestedTryCatch {
public static void main(String[] args) {
		try
		{//outer try
			try//inner try
			{
				String S = null;
				System.out.println(S.charAt(10));
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

