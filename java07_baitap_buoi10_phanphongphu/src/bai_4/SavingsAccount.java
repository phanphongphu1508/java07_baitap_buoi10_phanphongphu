package bai_4;
import java.text.DecimalFormat;
import java.util.Scanner;
public class SavingsAccount extends BankAccount {
	
	private double interest_rate;
	
	@Override
	public void import_account() {
		super.import_account();
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("Enter interest rate: ");
		this.interest_rate = keyBoard.nextDouble();
	}
    public void add_interest() {
        double interest = getBalance() + (getBalance() * interest_rate / 100);
        setBalance(interest);
        DecimalFormat formatBalance = new DecimalFormat("#,###");
	    String formatedBalance = formatBalance.format(getBalance());
        System.out.println("Interest added successfully. Current balance: " + formatedBalance + " VND");
    }

}