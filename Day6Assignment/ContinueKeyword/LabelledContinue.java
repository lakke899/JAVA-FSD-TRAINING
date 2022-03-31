package ContinueKeyword;

public class LabelledContinue {
	public static void main(String[] args) {
		outerLoop:
			for(int i=1;i<=10;i++) {
				innerLoop:
					for(int j=1;j<=10;j++) {
						if(i*j==10) 
							continue outerLoop;
						System.out.println(i*j);
							
						
					}
			}
	}

}
