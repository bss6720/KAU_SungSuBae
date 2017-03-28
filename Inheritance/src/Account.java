//Account class for bank account
//Super class of CheckingAccount

public class Account {
	
	private double balance; //private class variable that saves account's balance
	
	//Constructor to initialize balance
	public Account(double bal) {
		balance=bal;
	}
	
	//Adds money to the account
	public void credit(double money) {
		balance+=money;
	}
	
	//Subtracts money from the account
	public String debit(double money) {
		if(money>balance) {
			return "Debit exceeds the credit limit";
		}
		balance-=money;
		return null;
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
