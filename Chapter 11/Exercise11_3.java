/*
 Author: Jan McNulty
 Date:6/29/22
 */

import java.util.Scanner;
public class Exercise11_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Account account = new Account(111, 200);
		checkingAccounts checkingAccount = new checkingAccounts(112, 250);
		savingsAccounts savingsAccount = new savingsAccounts(113, 300);

		System.out.println("Enter amount to withdraw from Checking Account");
		checkingAccount.withdraw(input.nextDouble());
		
		System.out.println("Enter amount to withdraw from Savings Account");
		savingsAccount.withdraw(input.nextDouble());
		
		System.out.println(account);
		System.out.println(checkingAccount);
		System.out.println(savingsAccount);



	}
}