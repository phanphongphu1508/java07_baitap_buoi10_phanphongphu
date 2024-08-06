package bai_5;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int user_id;
	private String name;
	private List<Book> borrowed_book;
	
	public User() {
		this.borrowed_book = new ArrayList<Book>();
	}
	
	public void borrow(Book book) {
		borrowed_book.add(book);
	}
	public void returned_book(Book book) {
		// Duyệt qua danh sách các quyển đã mượn
		for (int i = 0; i < borrowed_book.size(); i++) {
			// Kiểm tra xem tiêu đề sách muốn trả có tồn tại trong danh sách đã mượn hay không
			if(borrowed_book.get(i).title.equals(book.title)) {
				// Nếu có thì xóa quyển sách đó
				borrowed_book.remove(i);
			}
		}
	}
	
	public int getUser_int() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBorrowed_book() {
		return borrowed_book;
	}
	public void setBorrowed_book(List<Book> borrowed_book) {
		this.borrowed_book = borrowed_book;
	}
}