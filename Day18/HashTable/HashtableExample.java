package HashTable;
import java.util.*;
class Books{
	int id, quantity;
	String name,author,publisher;
	Books(int id, String name, String author, String publisher, int quantity){
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}
public class HashtableExample {

	public static void main(String[] args) {
		//Creating map of Books
		Hashtable<Integer,Books> map = new Hashtable<Integer,Books>();
		Books b1 = new Books(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Books b2 = new Books(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
		Books b3=new Books(103,"Operating System","Galvin","Wiley",6);
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);
		//Traversing map
		for(Map.Entry<Integer, Books> z:map.entrySet()) {
			int key=z.getKey();
			Books b=z.getValue();
			System.out.println(key+" Details:");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}

}
