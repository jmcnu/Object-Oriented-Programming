/*
 Author:Jan McNulty
 Date:6/8/22
 */


public class Exercise9_7 {

	public static void main(String[] args) {

		account account1 = new account(1122,20000);
		account1.setAnnualInterestRate(4.5);

		System.out.println("Account ID: " + account1.getId());
		System.out.println("Account Balance: " + account1.getBalance());

		System.out.println("Withdrawing $2,500...");
		account1.withdraw(2500);

		System.out.println("Depositing $3,000...");
		account1.deposit(3000);

		System.out.println("Displaying updated info.");
		System.out.println("Account ID: " + account1.getId());
		System.out.println("Account Balance: " + account1.getBalance());
		System.out.println("Monthly interest rate: " + account1.getMonthlyInterestRate());
		System.out.println("Date account was created: " + account1.getdateCreated());
	}




}
