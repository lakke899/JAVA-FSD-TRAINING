package ExceptionHandling;
import java.io.*;  
class A{  
 void method()throws IOException{  
  throw new IOException("device error");  
 }  
}  
public class Testthrows4{  
   public static void main(String args[])throws IOException{//declare exception  
     A m=new A();  
     m.method();  
  
    System.out.println("normal flow...");  
  }  
} 

