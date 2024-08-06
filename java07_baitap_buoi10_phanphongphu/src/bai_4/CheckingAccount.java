package bai_4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckingAccount extends BankAccount {
	private double overdraft_limit;

    
	@Override
	public void import_account() {
		super.import_account();
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("Enter overdraft limit: ");
		this.overdraft_limit = keyBoard.nextDouble();
	}
    @Override
    public void withdraw() {
        if (this.overdraft_limit <= getBalance()) {
        	double overdraft_limit = getBalance() - this.overdraft_limit;
        	setBalance(overdraft_limit);
        	
        	DecimalFormat format = new DecimalFormat("#,###");
    	    String formatedoverdraft_limit = format.format(this.overdraft_limit);
            System.out.println("successfully withdraw " + formatedoverdraft_limit + " VND");
        } else {
            System.out.println("Exceeded withdrawal limit.");
        }
    }
}
