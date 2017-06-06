
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
			throw new Exception("���� ����� �� �����ϴ�.");
		}
		else{
			if(amount<0) throw new Exception("�����Է�");
			if(amount<=getBalance()){
				setBalance(getBalance()-amount);
			}
			else{
				throw new Exception("���� �����մϴ�.");
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
