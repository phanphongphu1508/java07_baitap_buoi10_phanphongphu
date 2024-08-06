package bai_3;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {
	private String employee_id;
	private List<String> subjects;

	public Teacher(String name, int age, String address, String employeeId) {
		super(name, age, address);
		this.employee_id = employeeId;
		this.subjects = new ArrayList<>();
	}

	@Override
	public void display_info() {
		super.display_info();
		System.out.println("Employee ID: " + employee_id);
		System.out.print("Assigned Subjects: ");
		for (String subject : subjects) {
			System.out.println(subject);
		}
	}
}