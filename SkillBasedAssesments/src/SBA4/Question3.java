/*Write a program to implement Hashtable and add atleast 4 values into it,
implement the putIfAbsent() method.
*/


package SBA4;



import java.util.Hashtable;
import java.util.Map;



public class Question3 {



public static void main(String[] args) {
Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
hm.put(1, "fathima");
hm.put(2, "atheena");
hm.put(31,"noobi");
hm.put(4,"arunima");
for(Map.Entry m:hm.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());
}
hm.putIfAbsent(56, "jeenabai");
System.out.println(hm);
}



}
/*OUTPUT:
31 noobi
4 arunima
2 atheena
1 fathima
{31=noobi, 4=arunima, 2=atheena, 56=jeenabai, 1=fathima}
*/