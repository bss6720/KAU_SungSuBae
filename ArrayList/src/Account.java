import java.util.Iterator;
import java.util.ArrayList;

public abstract class Account implements Valuable{
	private double balance;
	
	public Account(double balance){
		this.balance = balance;
	}
	
	public void credit(double money) {
		balance+=money;
	}
	
	public void debit(double money) throws Exception{
		if(balance>=0&&balance>=money){
			balance-=money;
		}
		else {
			System.out.println("Debit amount exceeded account balance or is negative value");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	protected void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract double getWithdrawableAccount();
	
	public abstract void passTime(int months);
	
	public abstract void passTime();
	
	public static double sumForAccount(ArrayList<Account> list) {
		double sum = 0;
		for(Account account: list) {
			sum+=account.getBalance();
		}
		return sum;
	}

	public static void passTimeForList(ArrayList<Account> list, int month) {
		for(Account account: list) {
			account.passTime(month);
		}
	}
}