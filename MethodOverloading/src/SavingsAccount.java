
public class SavingsAccount extends Account implements Valuable{
	
	private double interest;
	private int time;
	public SavingsAccount(double bal, double inter){
		super(bal);
		interest=inter;
		time=0;
	}
	
	@Override
	public void debit(double amount)throws Exception{
		if(time<12){
			throw new Exception("아직 출금할 수 없습니다.");
		}
		else{
			if(amount<0) throw new Exception("음수입력");
			if(amount<=getBalance()){
				setBalance(getBalance()-amount);
			}
			else{
				throw new Exception("돈이 부족합니다.");
			}
		}
	}
	
	public double getWithdrawableAccount() {
		if(getBalance()==0||time<12) {
			return 0;
		}
		else {
			return getBalance();
		}
	}
	
	public double estimateValue() {
		return getBalance()*(1+interest);
	}
	
	public double estimateValue(int months) {
		return getBalance()*Math.pow((1+interest),months);
	}
	
	public void passTime() {
		if(time<12){
			setBalance(getBalance()*(1+interest));
		}
		time++;
	}
	
	public double credit() {
		if(time<12) {
			return getBalance();
		}
		else {
			return 0;
		}
	}
	
	public void passTime(int months) {
		if(time<12){
			setBalance(getBalance()*Math.pow((1+interest),months));
		}
		time+=months;
	}
	
	public String toString(){
		return String.format("SavingsAccount_Balance: %.2f",getBalance());
	}
}
