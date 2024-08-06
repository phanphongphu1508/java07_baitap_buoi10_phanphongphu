package bai_3;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Nhập thông tin học sinh
        System.out.println("Enter student information:");
        System.out.print("Name: ");
        String studentName = scanner.nextLine();
        System.out.print("Age: ");
        int studentAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Address: ");
        String studentAddress = scanner.nextLine();
        System.out.print("Student ID: ");
        String studentId = scanner.nextLine();
        Student student = new Student(studentName, studentAge, studentAddress, studentId);
        System.out.println();
        
        // Nhập thông tin giáo viên
        System.out.println("Enter teacher information:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();
        System.out.print("Age: ");
        int teacherAge = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Address: ");
        String teacherAddress = scanner.nextLine();
        System.out.print("Employee ID: ");
        String employee_id = scanner.nextLine();
        Teacher teacher = new Teacher(teacherName, teacherAge, teacherAddress, employee_id);
        System.out.println();
        
        // Nhập thông tin khóa học
        System.out.println("Enter course information:");
        System.out.print("Course Name: ");
        String courseName = scanner.nextLine();
        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine();
        Course course = new Course(courseName, courseCode);

        // Chỉ định giáo viên cho khóa học
        course.assignTeacher(teacher);

        // Học sinh đăng ký khóa học
        student.enroll(course);

        // Hiển thị thông tin
        System.out.println("\nStudent Information:");
        student.display_info();
        System.out.println();
       
        System.out.println("Teacher Information:");
        teacher.display_info();
        System.out.println();
        course.display_info();

        scanner.close();
    }
}
