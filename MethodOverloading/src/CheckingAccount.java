
public class CheckingAccount extends Account implements Valuable{
	
	private double creditLimit, interest, loanInterest; //private class variable
	
	public CheckingAccount(double bal, double cl, double i, double li) { //sub-class constructor to initialize class variables
		super(bal); //explicit call for superclass constructor
		interest = i;
		loanInterest = li;
		creditLimit=-cl;
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
	
	//method that overrides superclass debit method
	@Override
	public void debit(double amount) throws Exception{ 
		if(getBalance()-amount<creditLimit) throw new Exception("한도초과");
		else if(amount<0) throw new Exception("음수입력");
		setBalance(getBalance()-amount);
	}
	
	//returns amount that can be withdrawn
	public double getWithdrawableAccount() {
		if(getBalance()>=0) {
			return getBalance()-creditLimit;
		}
		else if(getBalance()<creditLimit){
			return 0;
		}
		else {
			return -(creditLimit-getBalance());
		}
	}
	
	public boolean isBankrupted(){
		if(getBalance()<=creditLimit){
			return true;
		}
		else{
			return false;
		}
	}
	
	//method that calculates next month's balance depending on the balance left
		public void nextMonth() { 
			
			if(getBalance() > 0) {
				setBalance(getBalance()+getBalance()*interest);
			} else if(getBalance() < 0) {
				setBalance(getBalance()+getBalance()*loanInterest);
			}
		}
		
		public void passTime() {
			if(getBalance()>=0){
				setBalance(getBalance()+getBalance()*interest);
			}
			else {
				setBalance(getBalance()+getBalance()*loanInterest);
			}
		}
		public void passTime(int months) {
			if(getBalance()>=0){
				setBalance(getBalance()+getBalance()*interest*months);
			}
			else{
				setBalance(getBalance()+getBalance()*loanInterest*months);
			}
		}
		
		public double estimateValue() {
			if(getBalance()>=0){
				return getBalance()+getBalance()*interest;
			}
			else{
				return getBalance()+getBalance()*loanInterest;
			}
		}
		public double estimateValue(int months) {
			if(getBalance()>=0){
				return getBalance()+getBalance()*interest*months;
			}
			else{
				return getBalance()+getBalance()*loanInterest*months;
			}
		}
		
		public double credit() {
			return getBalance();
		}
		
		public String toString(){
			return String.format("CheckingAccount_Balance: %.2f",getBalance());
		}
}
