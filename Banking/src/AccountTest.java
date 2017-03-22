import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int f=0;
		Account acc1=new Account(0);
		Account acc2=new Account(0);
		acc1.credit(50);
		printBal(acc1.getBalance(),acc2.getBalance());
		
		System.out.print("Enter Withdrawal amount for account1: ");
		double d=input.nextDouble();
		System.out.printf("subtracting %f from account1 balance\n", d);
		f=acc1.debit(d);
		if(f==-1) {
			System.out.println("Debit amount exceeded account balance.");
		}
		printBal(acc1.getBalance(),acc2.getBalance());
		
		System.out.print("Enter Withdrawal amount for account2: ");
		d=input.nextDouble();
		System.out.printf("subtracting %f from account2 balance\n",d);
		f=acc2.debit(d);
		if(f==-1) {
			System.out.println("Debit amount exceeded account balance.");
		}
		printBal(acc1.getBalance(),acc2.getBalance());
		
	}
	public static void printBal(double a, double b) {
		System.out.printf("account1 balance: %f\n",a);
		System.out.printf("account2 balance: %f\n\n",b);
	}
}
