package ExceptionHandling;
import java.io.*;  
class V{  
 void method()throws IOException{  
  System.out.println("device operation performed");  
 }  
}  
public class Testthrows3{  
   public static void main(String args[])throws IOException{//declare exception  
     V m=new V();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
} 
