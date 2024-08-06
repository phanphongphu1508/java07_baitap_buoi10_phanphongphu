package bai_3;

public class Course {
	private String courseName;
	private String courseCode;
	private Teacher teacher;

	public Course(String courseName, String courseCode) {
		this.courseName = courseName;
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void assignTeacher(Teacher teacher) {
		this.teacher = teacher;
		System.out.println(teacher.name + " has been assigned to teach " + courseName);
	}

	public void display_info() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Course Code: " + courseCode);
		if (teacher != null) {
			System.out.println("Teacher: " + teacher.name);
		} else {
			System.out.println("No teacher assigned yet.");
		}
	}
}
