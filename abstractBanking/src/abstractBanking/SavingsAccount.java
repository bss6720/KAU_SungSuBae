package abstractBanking;

public class SavingsAccount extends Account{
	
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
			System.out.println("���� ����� �� �����ϴ�.");
		}
		else{
			if(money<=getBalance()){
				setBalance(getBalance()-money);
			}
			else{
				System.out.println("���� �����մϴ�.");
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
	
	public void passTime(int time) {
		if(months<12){
			setBalance(getBalance()*Math.pow((1+interest),time));
		}
		months+=time;
	}
}
