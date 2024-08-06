package bai_3;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
	private String studentId;
	private List<Course> courses;

	public Student(String name, int age, String address, String studentId) {
		super(name, age, address);
		this.studentId = studentId;
		this.courses = new ArrayList<>();
	}

	@Override
	public void display_info() {
		super.display_info();
		System.out.println("Student ID: " + studentId);
		System.out.print("Enrolled Courses: ");
		for (Course course : courses) {
			System.out.print(course.getCourseName());
			System.out.println();
		}
	}

	public void enroll(Course course) {
		courses.add(course);
		System.out.println(name + " has enrolled in " + course.getCourseName());
	}
}
