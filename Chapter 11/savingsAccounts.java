/*
 Author: Jan McNulty
 Date: 6/27/22
 */

public class savingsAccounts extends Account {
	private double overdraftlimit = 0;

	public savingsAccounts(int id,double balance) {
		super(id,balance);
	}
	
   
    public double withdraw(double amount) {
        if (balance - amount < overdraftlimit) {
     	   System.out.println("Amount is over the over draft limit. Enter a different amount.");
     	   }
     	   else {
     		balance = balance -amount;
     	   }
        return amount;
    }

   
	public String toString() {
        return "savingAccounts{" +
                "balance=" + balance +
                '}';
	}
}
