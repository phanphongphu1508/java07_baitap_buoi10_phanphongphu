package bai_4;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;
public class BankAccount {
	
	private String account_number;
	private String account_holder;
	private double balance;
	

	public void import_account() {
		Scanner keyBoard = new Scanner(System.in);
		System.out.print("Enter account number: ");
		this.account_number = keyBoard.nextLine();
		
		System.out.print("Enter account holder: ");
		this.account_holder = keyBoard.nextLine();
		
		System.out.print("Enter deposit amount: ");
		this.balance = keyBoard.nextDouble();

	}
	public void deposit() {
       DecimalFormat formatBalance = new DecimalFormat("#,###");
       String formatedBalance = formatBalance.format(this.balance);
       System.out.println("Deposit successful. Current balance: " + formatedBalance + " VND");
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
    public void display_info() {
    	DecimalFormat formatBalance = new DecimalFormat("#,###");
        String formatedBalance = formatBalance.format(this.balance);
        System.out.println("Account number: " + account_number);
        System.out.println("Account holder: " + account_holder);
        System.out.println("Balance: " + formatedBalance + " VND");
    }
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	public double getBalance() {
		 return balance;
	
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withdraw() {
		// TODO Auto-generated method stub
		
	}
	
}
