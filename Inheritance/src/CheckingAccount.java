//Sub-class of super class Account

public class CheckingAccount extends Account {
	
	private double creditLimit, interest, loanInterest; //private class variable
	
	public CheckingAccount(double bal) { //sub-class constructor to initialize class variables
		super(bal); //explicit call for superclass constructor
		interest = 0.1;
		loanInterest = 0.07;
		creditLimit=-100;
	}
	
	public double getInterest() { //getter for variable interest
		return interest;
	}
	
	public double getCreditLimit() { //getter for variable creditLimit
		return creditLimit;
	}
	
	public double getLoanInterest() { //getter for variable loanInterest
		return loanInterest;
	}

	@Override
	public String debit(double money) { //method that overrides superclass debit method
		
		if(super.getBalance()-money<getCreditLimit()) { //checks if debit amount exceeds credit limit
			return "debit exceeds credit limit"; 		//when it exceeds, returns error message in string
		}
		
		super.setBalance(super.getBalance()-money); 	//when it is valid amount, sets the subtracted amount
		return null;						//same as return 0 in c programming, when exited normally
	}
	
	public void nextMonth() { //method that calculates next month's balance depending on the balance left
		
		if(super.getBalance() > 0) {
			super.setBalance(super.getBalance()+super.getBalance()*getInterest());
		} else if(getBalance() < 0) {
			super.setBalance(super.getBalance()+super.getBalance()*getLoanInterest());
		}
	}
}
