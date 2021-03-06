
public abstract class Account {
	
	private double balance;
	
	public Account(double bal) {
		balance=bal;
	}
	
	public void credit(double money) {
		balance+=money;
	}
	
	public void debit(double amount) throws Exception{
		balance-=amount;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double bal) {
		balance=bal;
	}
	
	public abstract double getWithdrawableAccount();
	public abstract void passTime(int months);
}
