import java.util.Date;

public class account {
	int id = 0;
	double balance = 0;
	double annualInterestRate = 0;
	private Date dateCreated;

	account() {		
	}

	account(int newId,double newBalance) {
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

	public Date getdateCreated() {
		return dateCreated;
	}

	double getMonthlyInterestRate() {
		return (annualInterestRate / 12) / 100;
	}

	double getMothlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	double withdraw(double amount) {
	
		return balance -= amount;

	}
	double deposit(double amount) {
		
		return balance += amount;
	}
}

