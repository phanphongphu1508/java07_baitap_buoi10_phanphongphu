package bai_1;
import java.util.Scanner;
public class Employee {
	private String name;
	private int age;
	private double salary;
	
	public void import_infor() {
		Scanner keyBoard = new Scanner(System.in);
		// name
		System.out.print("Enter name: ");
		this.name = keyBoard.nextLine();
		// age
		do {
			System.out.print("Enter age: ");
			this.age = keyBoard.nextInt();
			if (age < 1 || age > 99) {
				System.out.println("Invalid age entered! Please re-enter.");
			}
		} while(age < 1 || age > 99);
		// salary
		do {
			System.out.println("Enter Salary: ");
			this.salary = keyBoard.nextDouble();
			if (salary < 1 ) {
				System.out.print("Invaild salary enterde! Please re-enter.");
			}
		}while(salary < 1);
	}
	// print name, age, salary
	public void display_infor() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Salary: " + this.salary);
	}
	public double calculate_salary() {
		return this.salary;
	}
}
