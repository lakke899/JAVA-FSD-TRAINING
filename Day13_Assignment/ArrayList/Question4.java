package ArrayList;
import java.util.*;
import java.util.*;
class Book implements Comparable<Book>{
String name;
String author;
String year;
int copies;
public Book(String name,String author,String year,int copies) {
this.name=name;
this.author=author;
this.year=year;
this.copies=copies;
}
@Override
public int compareTo(Book o) {
// sort based on year
return this. year.compareTo(o.year);
}
}



public class Question4 {



public static void main(String[] args) {
ArrayList<Book> list=new ArrayList<Book>();
Book b1=new Book("The Harry Potter","J.K. Rowling","1997",500000);
Book b2=new Book("The Lord of the Rings","J. R. R. Tolkien","1954",1500000);
Book b3=new Book("The Twilight SagA","Stephenie Meyer","2005",1000000);
Book b4=new Book("To Kill a Mockingbird","Harper Lee","1960",400000);
list.add(b1);
list.add(b2);
list.add(b3);
list.add(b4);
Collections.sort(list);
for(Book b:list) {
System.out.println(b.name+" "+b.author+" "+b.year+" "+b.copies);
}



}



}
/*Book b1=new Book("The Harry Potter","J.K. Rowling",1997,500000);
Book b2=new Book("The Lord of the Rings","J. R. R. Tolkien",1954,1500000);
Book b3=new Book("The Twilight SagA","Stephenie Meyer",2005,1000000);
Book b4=new Book("To Kill a Mockingbird","Harper Lee",1960,400000);
list.add(b1);
list.add(b2);
list.add(b3);
list.add(b4);*/