package bai_4;
public class Application {
	public static void main(String[] args) {
		  SavingsAccount savingsAccount = new SavingsAccount();
		  savingsAccount.import_account();
		  System.out.println();
	      savingsAccount.deposit();
	      savingsAccount.add_interest();
	      savingsAccount.display_info();
	      System.out.println();
        
	      CheckingAccount checkingAccount = new CheckingAccount();
	      checkingAccount.import_account();
	      System.out.println();
	      checkingAccount.withdraw();
	      checkingAccount.display_info();
	  }
}
