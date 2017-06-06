
public class SavingsAccount extends Account implements Valuable{
	
	private double interest;
	private int months;
	public SavingsAccount(double bal, double inter){
		super(bal);
		interest=inter;
		months=0;
	}
	
	@Override
	public String debit(double money){
		if(months<12){
			System.out.println("아직 출금할 수 없습니다.");
		}
		else{
			if(money<=getBalance()){
				setBalance(getBalance()-money);
			}
			else{
				System.out.println("돈이 부족합니다.");
			}
		}
		return null;
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
