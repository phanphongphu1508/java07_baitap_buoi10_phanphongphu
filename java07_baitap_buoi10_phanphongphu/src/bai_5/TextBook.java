package bai_5;

public class TextBook extends Book {
	private String subject;

	@Override
	public void display_info() {
		super.display_info();
		System.out.println("Subject: " + subject);
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}