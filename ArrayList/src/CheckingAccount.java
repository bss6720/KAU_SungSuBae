
public class CheckingAccount extends Account{
	private double credit_limit,interest,loan_interest;
	
	public CheckingAccount(double balance,double credit_limit,double interest,double loan_interest) {
		super(balance);
		this.credit_limit = -credit_limit;
		this.interest = interest;
		this.loan_interest = loan_interest;
	}
	
	@Override
	public void debit(double money) throws Exception{
		if(getBalance() - money >= credit_limit&&money>=0) {
			setBalance(getBalance()-money);
		} else {
			//System.out.println("Invalid debit amount");
			throw new Exception("음수 입력!");
		}
	}
	
	public void nextMonth() {
		if(getBalance() >=0) setBalance(getBalance()*(1+interest));
		else setBalance(getBalance()*(1+loan_interest));
	}
	
	
	public double getWithdrawableAccount() {
		if(getBalance()>credit_limit) {
			return getBalance()-credit_limit;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public void passTime(int months) {
		if(getBalance()>=0) {
			setBalance(getBalance()*(1+interest*months));
		}
		else {
			setBalance(getBalance()*(1+loan_interest*months));
		}
	}
	
	@Override
	public void passTime() {
		if(getBalance()>=0) {
			setBalance(getBalance()*(1+interest));
		}
		else {
			setBalance(getBalance()*(1+loan_interest));
		}
	}
	
	public boolean isBankrupted() {
		if(getBalance()<credit_limit) return true;
		return false;
	}
	
	public double EstimateValue(int month) {
		if(getBalance()>=0) {
			return getBalance()*(1+interest*month);
		}
		else {
			return getBalance()*(1+loan_interest*month);
		}
	}
	
	public double estimateValue(int month) {
		if(getBalance()>=0) {
			return getBalance()*(1+interest*month);
		}
		else {
			return getBalance()*(1+loan_interest*month);
		}
	}
	
	public double estimateValue() {
		if(getBalance()>=0) {
			return getBalance()*(1+interest);
		}
		else {
			return getBalance()*(1+loan_interest);
		}
	}

	@Override
	public String toString() {
		return String.format("CheckingAccount_Balance: %.2f",getBalance());
	}
}
