package bai_5;

public class ReferenceBook extends Book {
	protected String field;

	@Override
	public void display_info() {
		super.display_info();
		System.out.println("Field: " + field);
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

}
