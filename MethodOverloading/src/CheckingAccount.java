
public class CheckingAccount implements Valuable{
	
	private double balance,creditLimit, interest, loanInterest; //private class variable
	
	public CheckingAccount(double bal, double cl, double i, double li) { //sub-class constructor to initialize class variables
		balance=bal; //explicit call for superclass constructor
		interest = i;
		loanInterest = li;
		creditLimit=-cl;
	}

	
	//method that calculates next month's balance depending on the balance left
	public void nextMonth() { 
		
		if(balance > 0) {
			balance=balance+balance*interest;
		} else if(balance < 0) {
			balance=balance+balance*loanInterest;
		}
	}
	
	public void passTime() {
		if(balance>=0){
			balance=balance+balance*interest;
		}
		else {
			balance=balance+balance*loanInterest;
		}
	}
	public void passTime(int months) {
		if(balance>=0){
			balance=balance+balance*interest*months;
		}
		else{
			balance=balance+balance*loanInterest*months;
		}
	}
	
	public double estimateValue() {
		if(balance>=0){
			return balance+balance*interest;
		}
		else{
			return balance+balance*loanInterest;
		}
	}
	public double estimateValue(int months) {
		if(balance>=0){
			return balance+balance*interest*months;
		}
		else{
			return balance+balance*loanInterest*months;
		}
	}
	
	public double credit() {
		return balance;
	}
	
	public String toString(){
		return String.format("CheckingAccount_Balance: %.2f",balance);
	}
}
