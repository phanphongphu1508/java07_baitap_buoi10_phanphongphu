package bai_2;

import java.util.Scanner;

public class TextBook extends Book {
	protected String subject;

	public TextBook() {

	}

	public void import_info() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter title: ");
		this.title = scan.nextLine();

		System.out.print("Enter author: ");
		this.author = scan.nextLine();

		System.out.print("Enter ibsn: ");
		this.isbn = scan.nextLine();

		System.out.print("Enter subject: ");
		this.subject = scan.nextLine();
	}

	public TextBook(String title, String author, String ibsn, String subject) {
		super(title, author, ibsn);
		this.subject = subject;
	}

	@Override
	public void display_infor() {
		super.display_infor();
		System.out.println("Subject: " + this.subject);
	}
}