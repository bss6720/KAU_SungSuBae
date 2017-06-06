
public class SavingsAccount extends Account implements Valuable{
	
	private double interest;
	private int months;
	public SavingsAccount(double bal, double inter){
		super(bal);
		interest=inter;
		months=0;
	}
	
	@Override
	public void debit(double amount)throws Exception{
		if(months<12){
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
		if(getBalance()==0||months<12) {
			return 0;
		}
		else {
			return getBalance();
		}
	}
	
	public double EstimateValue(int months) {
		passTime(months);
		return getBalance();
	}
	
	public void passTime(int time) {
		if(months<12){
			setBalance(getBalance()*Math.pow((1+interest),time));
		}
		months+=time;
	}
	public String toString(){
		return String.format("SavingsAccount_Balance: %.2f",getBalance());
	}
}
