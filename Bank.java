package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Bank {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.next();
		System.out.print("Is there deposit initial (y/n): ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Is initial deposit value: ");
			double initialDesposit = sc.nextDouble();
			account = new Account (number,holder, initialDesposit);
		}
		
		else {
			account = new Account (number,holder);
		
		}
		System.out.println();
		System.out.println("Account Data: ");		
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Upadate data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Upadate data: ");
		System.out.println(account);
		
		

		sc.close();
		
	}

}
