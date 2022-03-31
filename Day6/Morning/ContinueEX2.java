package Morning;

public class ContinueEX2 {
	public static void main(String[] args) {  
        //outer loop  
        for(int i=1;i<=3;i++){    
                //inner loop  
                for(int j=1;j<=3;j++){    
                    if(i==2&&j==2){    
                        //using continue statement inside inner loop  
                        continue;    
                    }    
                    System.out.println(i+" "+j);    
                }    
        }    
}  
}  

/* output
1,1
1,2
1,3
2,1
2,3
3,1
3,2
3,3
*/


