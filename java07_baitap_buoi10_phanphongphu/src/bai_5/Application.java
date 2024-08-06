package bai_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Book> listBooks = new ArrayList<Book>();

		TextBook textBook = new TextBook();
		textBook.title = "Sách số 1";
		textBook.author = "Tác giả 1";
		textBook.asbn = "ISBN 1";
		textBook.setSubject("Subject 1");

		TextBook textBook2 = new TextBook();
		textBook2.title = "Sách số 2";
		textBook2.author = "Tác giả 2";
		textBook2.asbn = "ISBN 2";
		textBook2.setSubject("Subject 2");

		ReferenceBook referenceBook = new ReferenceBook();
		referenceBook.title = "Sách số 3";
		referenceBook.author = "Tác giả 3";
		referenceBook.asbn = "ISBN 3";
		referenceBook.setField("Field 1");

		listBooks.add(textBook);
		listBooks.add(textBook2);
		listBooks.add(referenceBook);
		System.out.println("Vui lòng chọn vị trí sách muốn mượn bên dưới: ");
		for (int i = 0; i < listBooks.size(); i++) {
			System.out.println(i + ". " + listBooks.get(i).title);
		}
		System.out.print("Nhập vị trí sách cần mượn: ");
		int viTri = scanner.nextInt();
		
		Book borrowedBook = listBooks.get(viTri);
	
		User user = new User();
		user.setUser_id(1);
		user.setName("Phan Phong Phú");
		
		user.borrow(borrowedBook);
		listBooks.remove(viTri);
		
		System.out.println("list sách trong thư viện: " + listBooks.size());
		System.out.println("list borrow book: " + user.getBorrowed_book().size());

		System.out.println("Vui lòng chọn vị trí sách muốn trả bên dưới: ");
		for (int i = 0; i < user.getBorrowed_book().size(); i++) {
			System.out.println(i + ". " + user.getBorrowed_book().get(i).title);
		}
		int viTriTra = scanner.nextInt();
		Book returnBook = user.getBorrowed_book().get(viTriTra);
		user.returned_book(returnBook);
		listBooks.add(returnBook);

		System.out.println("list sách trong thư viện: " + listBooks.size());
		System.out.println("list borrow book: " + user.getBorrowed_book().size());
		scanner.close();
	}
}
