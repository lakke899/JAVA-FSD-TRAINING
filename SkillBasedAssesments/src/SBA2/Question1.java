package SBA2;

import java.util.ArrayList;
import java.util.Collections;

/*
 * (day-13 Assignment)
1.Create an arraylist of user-defined data type Book. it should have:-
i)Name of the Book
ii)Author of the book
iii)year of publication of the book
iV)number of copies sold.
sort the array list based on the year of publication.

 */
class Book implements Comparable<Book> {
	String name;
	String author;
	String year;
	int copies;

	public Book(String name, String author, String year, int copies) {
		this.name = name;
		this.author = author;
		this.year = year;
		this.copies = copies;
	}

	@Override
	public int compareTo(Book o) {
// sort based on year
		return this.year.compareTo(o.year);
	}
}

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		Book b1 = new Book("The Harry Potter", "J.K. Rowling", "1997", 500000);
		Book b2 = new Book("The Lord of the Rings", "J. R. R. Tolkien", "1954", 1500000);
		Book b3 = new Book("The Twilight SagA", "Stephenie Meyer", "2005", 1000000);
		Book b4 = new Book("To Kill a Mockingbird", "Harper Lee", "1960", 400000);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		Collections.sort(list);
		for (Book b : list) {
			System.out.println(b.name + " " + b.author + " " + b.year + " " + b.copies);
		}

	}

}
/*
OUTPUT
The Lord of the Rings J. R. R. Tolkien 1954 1500000
To Kill a Mockingbird Harper Lee 1960 400000
The Harry Potter J.K. Rowling 1997 500000
The Twilight SagA Stephenie Meyer 2005 1000000
*/
