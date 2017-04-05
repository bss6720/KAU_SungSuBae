
public class SavingsAccount implements Valuable{
	
	private double interest;
	private int months;
	private double balance;
	public SavingsAccount(double bal, double inter){
		balance = bal;
		interest=inter;
		months=0;
	}
	
	public double EstimateValue(int months) {
		passTime(months);
		return balance;
	}
	
	public void passTime(int time) {
		if(months<12){
			balance=balance*Math.pow((1+interest),time);
		}
		months+=time;
	}
	public String toString(){
		return String.format("SavingsAccount_Balance: %.2f",balance);
	}
}
