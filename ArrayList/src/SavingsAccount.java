

public class SavingsAccount extends Account {
	private int time;
	private double interest;
	
	public SavingsAccount(double balance, double interest) {
		super(balance);
		this.interest = interest;
	}
	
	@Override
	public void debit(double money) throws Exception{
		if(time>=12&&money<=getBalance()) {
			setBalance(getBalance()-money);
		} else throw new Exception("아직 출금할 수 없습니다");
	}
	
	public double getWithdrawableAccount() {
		if(time<12) return 0;
		else return getBalance();
	}
	
	@Override
	public void passTime(int months) {
		if(time+months<=12){
			setBalance(getBalance()*Math.pow((1+interest),months));
			time+=months;
		}
	}
	
	@Override
	public void passTime() {
		if(time+1<=12){
			setBalance(getBalance()*(1+interest));
			time++;
		}
	}
	
	public double estimateValue(int month) {
		return getBalance()*Math.pow((1+interest),month-time);
	}
	
	public double estimateValue() {
		return getBalance()*(1+interest);
	}

	@Override
	public String toString() {
		return String.format("SavingsAccount_Balance: %.2f",getBalance());
	}
}
