import java.util.Scanner;
public class CashRegisterTester {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean sentinel = true;
		double amountEntered = 0;
		CashRegister testRegister = new CashRegister();
		
		while (sentinel) {
			System.out.print("Enter a purchase amount or -1 to quit: ");
			amountEntered = in.nextDouble();
			if (amountEntered == -1)
				break;
			testRegister.recordPurchase(amountEntered);
			
		}//payment loop
		
		System.out.print("Enter payment: ");
		testRegister.receivePayment(in.nextDouble());
		
		double change = testRegister.giveChange();
		System.out.print("Your change: ");
		System.out.printf("%.2f", change);
		
		in.close();
		
	}//main

}//Tester
