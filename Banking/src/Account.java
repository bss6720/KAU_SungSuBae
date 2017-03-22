
public class Account {
	
	private double bal;
	
	public Account(double bal) {
		this.bal=bal;
	}
	
	public void credit(double money) {
		bal+=money;
	}
	
	public int debit(double money) {
		if(money>bal) {
			return -1;
		}
		bal-=money;
		return 0;
	}
	
	public double getBalance() {
		return bal;
	}
}
