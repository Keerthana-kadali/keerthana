package org.tnsif.capgemini.c2tc.arrayDemo;
class Book
{
	String title;
	String author;
	double price;
	public Book(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void display()
	{
		System.out.println("TITLE "+ title +"AUTHOR "+ author + "PRICE "+price);
	}
}
public class ArrayOfObject {

	public static void main(String[] args) {
		Book[] books=new Book[3];
		books[0]=new Book("java language ","keerthana ",120000);
		books[1]=new Book("java language ","veda vani ",20000);
		books[2]=new Book("java language ","prasanna ",220000);
		for(Book book:books)		
		book.display();

	}

}
