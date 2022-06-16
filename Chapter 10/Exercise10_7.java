/*
 Author: Jan McNulty
 Date:6/14/22
 */
package chapter10;

import java.util.Scanner;
public class Exercise10_7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		account[] accounts = new account[10];


		for (int i = 0; i < accounts.length; i++ ) {
			accounts[i] = new account (i,100);
		}

		int choice = 0;
		int id = askForId(accounts);


		while (choice != 4) {
			account user = getaccount(accounts, id);

			System.out.println("Main Menu");
			System.out.println("1: check balance");
			System.out.println("2: withdraw");
			System.out.println("3: deposit");
			System.out.println("4: exit");
			System.out.println("Enter a choice:");
			choice = input.nextInt();

			if (choice == 1) {
				System.out.println("The balance is $" + user.getBalance());
			}
			else if (choice == 2) {
				System.out.println("Enter an amount to withdraw:");
				user.withdraw(input.nextDouble());
			}
			else if (choice == 3) {
				System.out.println("Enter an amount to deposit");
				user.deposit(input.nextDouble());
			}
			else if (choice == 4) {
				System.out.println("Logged out");
				System.out.println("");

				id =askForId(accounts);
				choice = 0;
				System.out.println("Invalid input... Enter a number 1-4");

			}
		}
	}

	public static int askForId(account[] accounts) {
		Scanner input = new Scanner(System.in);

		int id = 0;
		boolean isValidID = false;

		while (!isValidID) {
			System.out.println("Enter an id:");
			id = input.nextInt();

			if (!hasId(accounts,id)) {
				System.out.println("Invalid id: Please try again");
			}
			else {
				isValidID = true;
			}
		}
		return id;
	}

	public static account getaccount(account[] accounts, int id ) {
		for (account account: accounts) {
			if(id == account.getId()) {
				return account;
			}
		}
		return null;
	}

	public static boolean hasId(account[] accounts, int id) {
		for (account account: accounts) {
			if(id == account.getId()) {
				return true;
			}
		}
		return false;
	}
}
