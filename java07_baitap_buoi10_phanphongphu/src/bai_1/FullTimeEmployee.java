package bai_1;
import java.util.Scanner;
public class FullTimeEmployee extends Employee {
	
	private double benifits;
	
	@Override
	public void import_infor() {
		Scanner keyBoard = new Scanner(System.in);
		super.import_infor();
		do {
			System.out.println("Enter benifits: ");
			this.benifits = keyBoard.nextDouble();
			if (benifits < 1 ) {
				System.out.print("Invaild benifits enterde! Please re-enter.");
			}
		}while(benifits < 1);
	}
	@Override
	public void display_infor() {
		super.display_infor();
		System.out.println("Benifits: " + benifits);
		System.out.println("Salary: " + this.calculate_salary());

	}
	public double calculate_salary() {
		return this.benifits + super.calculate_salary();
	}
}
