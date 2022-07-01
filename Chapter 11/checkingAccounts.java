/*
 Author:Jan McNulty
 Date: 6/27/22
 */


public class checkingAccounts extends Account{

	private double overdraftlimit = 100;


	public checkingAccounts(int id, double balance) {
		super(id,balance);
	}


	public double withdraw(double amount) {

       if ((overdraftlimit + balance) >= amount) {
    	   System.out.println("Amount is over the over draft limit." + (overdraftlimit +balance)+ amount);
    	   }
    	   else {
    		balance = balance -amount;
    	   }
       return balance;
       }
	
	



	public String toString() {
		return "checkingAccounts{"+
				"balance=" + balance +
				'}';
	}
}