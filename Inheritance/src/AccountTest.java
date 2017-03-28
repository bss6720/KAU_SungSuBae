import java.util.Scanner;
//test class for CheckingAccount
public class AccountTest {
	
	//main method
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in); //creating object for scanner class
		String err="";	//variable for error message
		
		//Creating two objects with balance 100
		CheckingAccount acc1=new CheckingAccount(100);
		CheckingAccount acc2=new CheckingAccount(100);
		
		printBal(acc1.getBalance(),acc2.getBalance());
		
		//Withdrawing money from acc1
		System.out.print("Enter Withdrawal amount for account1: ");
		double d=input.nextDouble();
		System.out.printf("subtracting %f from account1 balance\n", d);
		err=acc1.debit(d);
		if(err!=null) {  //if withdrawal amount exceeds credit limit,prints error message err
			System.out.println(err);
		}
		printBal(acc1.getBalance(),acc2.getBalance());
		
		//Withdrawing money from acc2
		System.out.print("Enter Withdrawal amount for account2: ");
		d=input.nextDouble();
		System.out.printf("subtracting %f from account2 balance\n",d);
		err=acc2.debit(d);
		if(err!=null) { //if return value is not null, prints error message err
			System.out.println(err);
		}
		printBal(acc1.getBalance(),acc2.getBalance());
		
		//calculates next balance for next month
		acc1.nextMonth();
		acc2.nextMonth();
		System.out.println("next month!");
		printBal(acc1.getBalance(),acc2.getBalance());
	}
	public static void printBal(double a, double b) { //method that receives balance of two accounts and print them
		System.out.printf("account1 balance: %f\n",a);
		System.out.printf("account2 balance: %f\n\n",b);
	}
}
