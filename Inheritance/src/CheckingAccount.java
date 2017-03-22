
public class CheckingAccount extends Account {
	
	private double credit_limit, interest, loan_interest;
	
	public CheckingAccount(double bal) {
		super(bal);
		interest = 0.1;
		loan_interest = 0.07;
		credit_limit=-100;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public double getCreditLimit() {
		return credit_limit;
	}
	
	public double getLoanInterest() {
		return loan_interest;
	}

	@Override
	public String debit(double money) {
		if(super.getBalance()-money<getCreditLimit()) {
			return "debit exceeds credit limit";
		}
		super.setBalance(super.getBalance()-money);
		return null;
	}
	
	public void nextMonth() {
		if(super.getBalance() > 0) {
			super.setBalance(super.getBalance()+super.getBalance()*getInterest());
		} else if(getBalance() < 0) {
			super.setBalance(super.getBalance()+super.getBalance()*getLoanInterest());
		}
	}
}
