
public class SavingsAccount implements Valuable{
	
	private double interest;
	private int time;
	private double balance;
	public SavingsAccount(double bal, double inter){
		balance = bal;
		interest=inter;
		time=0;
	}
	public double estimateValue() {
		return balance*(1+interest);
	}
	
	public double estimateValue(int months) {
		return balance*Math.pow((1+interest),months);
	}
	
	public void passTime() {
		if(time<12){
			balance=balance*(1+interest);
		}
		time++;
	}
	
	public void passTime(int months) {
		if(time<12){
			balance=balance*Math.pow((1+interest),months);
		}
		time+=months;
	}
	
	public double credit() {
		if(time<12) {
			return balance;
		}
		else {
			return 0;
		}
	}
	
	public String toString(){
		return String.format("SavingsAccount_Balance: %.2f",balance);
	}
}
