package bai_1;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
	
	double hours_Worked;
	double hourly_Rate;
	
	@Override
	public void import_infor() {
		Scanner keyBoard = new Scanner(System.in);
		super.import_infor();
		System.out.print("Enter hours worked: ");
		this.hours_Worked = keyBoard.nextDouble();
		System.out.print("Enter hourly rate: ");
		this.hourly_Rate = keyBoard.nextDouble();
	}
	@Override
	public void display_infor() {
		super.display_infor();
		System.out.println("Hours worked: " + this.hours_Worked);
		System.out.println("Hourly rate: " + this.hourly_Rate);
		System.out.println("Hourly rate: " + this.hourly_Rate);
	}
	@Override
	public double calculate_salary() {
		return this.hours_Worked * hourly_Rate;
	}
}
