package bai_5;

public class Book {

	protected String title;
	protected String author;
	protected String asbn;

	public void display_info() {
		System.out.printf("Title: %s - Author: %s - ISBN: %s\n", title, author, asbn);
	}
}
