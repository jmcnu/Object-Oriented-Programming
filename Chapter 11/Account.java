/*
 Author: Jan McNulty
 Date:6/27/2022
 */


public class Account {
	int id;
	double balance;
	double annualInterestRate;
	private java.util.Date dateCreated;

	Account() {	
		
	}

	Account(int newId,double newBalance) {
		id = newId;
		balance = newBalance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		int newId = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		double  newBalance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
	double newAnnualInterestRate = annualInterestRate;
	}

	public java.util.Date getDateCreated() {
		return  dateCreated;
	}

	double getMonthlyInterestRate() {
		return balance * (annualInterestRate / 12) / 100;
	}


	double withdraw(double amount) {
	
		return balance -= amount;

	}
	double deposit(double amount) {
		
		return balance += amount;
	}
	public String toString() {
        return "Account {"+
                "balance=" + balance +
                '}';
	}
}