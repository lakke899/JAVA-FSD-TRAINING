package BreakKeyword;
public class LabelledBreakEX {

	public static void main(String[] args) {
		
		   outer:	
			for(int i=0; i<3; i++){
				System.out.println( i);
				inner:
			    		for(int j=0; j<3; j++)
					{
				   		System.out.println(j);
				   		if(i== j+1)
				 		     break outer;		   
				   		System.out.println("Bye");	
					}
			  	}
		}

	}

