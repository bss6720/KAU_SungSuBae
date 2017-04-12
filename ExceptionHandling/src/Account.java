//Account class for bank account
//Super class of CheckingAccount

public class Account {
	
	private double balance; //private class variable that saves account's balance
	
	//Constructor to initialize balance
	public Account(double bal) {
		balance=bal;
	}
	
	//Adds money to the account
	public void credit(double amount) {
		balance+=amount;
	}
	
	//Subtracts money from the account
	public void debit(double amount) throws Exception{
		if(amount<0) throw new Exception("amount is negative");
		balance-=amount;
	}
	
	//Balance getter
	public double getBalance() {
		return balance;
	}
	
	//Balance setter
	protected void setBalance(double bal) {
		balance=bal;
	}
}
