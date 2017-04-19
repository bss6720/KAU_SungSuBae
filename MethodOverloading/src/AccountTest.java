import java.util.InputMismatchException;
import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]) throws Exception{
		
		/*
		 * 메소드 오버로딩에 대해 테스트 하는 코드입니다.
		 * 변수명 및 메소드명 외 다른 부분은 절대 수정하지 마세요.
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Valuable[] objectList = new Valuable[4];
		
		objectList[0] = new CheckingAccount(100,50,0.01,0.07);
		objectList[1] = new SavingsAccount(100,0.05);
		objectList[2] = new Human("Mark", 20);
		objectList[3] = new Car("MyCar", 5000);
		
		for(Valuable objectItem : objectList){
			System.out.printf("%s \n", objectItem.toString());
			System.out.printf("1 month later Value (Method Overloding, no parameter) : %.2f\n", objectItem.estimateValue());
			System.out.printf("5 month later Value : %.2f\n\n", objectItem.estimateValue(5));
		}
	}
}
