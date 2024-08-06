package bai_2;

import java.util.Scanner;

public class ReferenceBook extends Book {
	protected String field;

	public ReferenceBook() {

	}

	public ReferenceBook(String title, String author, String ibsn, String field) {
		super(title, author, ibsn);
		this.field = field;
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
		this.field = scan.nextLine();
	}

	@Override
	public void display_infor() {
		super.display_infor();
		System.out.println("Field: " + this.field);
	}
}
