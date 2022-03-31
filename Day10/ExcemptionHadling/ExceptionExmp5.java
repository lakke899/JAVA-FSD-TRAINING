package ExcemptionHadling;

public class ExceptionExmp5 {
	public static void main(String[] args)
	{
		try{
			String str1=null;
			System.out.println(str1.length());
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println("end of the program");
	}
}
