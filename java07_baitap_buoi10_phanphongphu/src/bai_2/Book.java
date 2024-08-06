package bai_2;

import java.util.Scanner;

public class Book {
	protected String title;
	protected String author;
	protected String isbn;

	public Book() {

	}

	public Book(String title, String author, String ibsn) {
		this.title = title;
		this.author = author;
		this.isbn = ibsn;
	}

	

	public void display_infor() {
		System.out.println("Title: " + this.title);
		System.out.println("Author: " + this.author);
		System.out.println("IBSN: " + this.isbn);
	}
}