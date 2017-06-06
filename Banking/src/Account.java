
public class Account {
	
	private double balance;
	
	public Account(double bal) {
		this.balance=bal;
	}
	
	public void credit(double money) {
		balance+=money;
	}
	
	public int debit(double money) {
		if(money>balance) {
			return -1;
		}
		balance-=money;
		return 0;
	}
	
	public double getBalance() {
		return balance;
	}
}
