
public class Account {
	
	private double balance;
	
	public Account(double bal) {
		balance=bal;
	}
	
	public void credit(double money) {
		balance+=money;
	}
	
	public String debit(double money) {
		if(money>balance) {
			return "Debit exceeds the credit limit";
		}
		balance-=money;
		return null;
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double bal) {
		balance=bal;
	}
}
