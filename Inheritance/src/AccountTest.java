import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String f="";
		CheckingAccount acc1=new CheckingAccount(100);
		CheckingAccount acc2=new CheckingAccount(100);
		
		printBal(acc1.getBalance(),acc2.getBalance());
		
		System.out.print("Enter Withdrawal amount for account1: ");
		double d=input.nextDouble();
		System.out.printf("subtracting %f from account1 balance\n", d);
		f=acc1.debit(d);
		if(f!=null) {
			System.out.println(f);
		}
		printBal(acc1.getBalance(),acc2.getBalance());
		
		System.out.print("Enter Withdrawal amount for account2: ");
		d=input.nextDouble();
		System.out.printf("subtracting %f from account2 balance\n",d);
		f=acc2.debit(d);
		if(f!=null) {
			System.out.println(f);
		}
		printBal(acc1.getBalance(),acc2.getBalance());
		
		acc1.nextMonth();
		acc2.nextMonth();
		System.out.println("next month!");
		printBal(acc1.getBalance(),acc2.getBalance());
	}
	public static void printBal(double a, double b) {
		System.out.printf("account1 balance: %f\n",a);
		System.out.printf("account2 balance: %f\n\n",b);
	}
}
