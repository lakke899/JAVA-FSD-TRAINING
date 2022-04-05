/*Write a program to implement Hashtable and add atleast 4 values into it,
implement the putIfAbsent() method.
*/




import java.util.Hashtable;
import java.util.Map;



public class Question3 {



public static void main(String[] args) {
Hashtable<Integer,String> hm=new Hashtable<Integer,String>();
hm.put(1, "marcus");
hm.put(2, "cherry");
hm.put(31,"revanth");
hm.put(4,"ranjith");
for(Map.Entry m:hm.entrySet()) {
System.out.println(m.getKey()+" "+m.getValue());
}
hm.putIfAbsent(56, "rahul");
System.out.println(hm);
}



}
/*OUTPUT:
31 revanth
4 ranjith
2 cherry
1 marcus
{31=revanth, 4=ranjith, 2=cherry, 56=rahul, 1=marcus}
*/
