package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account owner: ");
		sc.nextLine();
		String owner = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, owner, initialDeposit);	
		}else {
			account = new Account(number, owner);
		}
		
		System.out.println();
		System.out.println("ACCOUNT DATA");
		
		System.out.println(account.toString() + "\n");

		//Deposito
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println();
		
		System.out.println("UPDATED ACCOUNT DATA");
		System.out.println(account.toString());
		
		System.out.println();
		
		//Saque
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println();
		
		System.out.println("UPDATED ACCOUNT DATA");
		System.out.println(account.toString());
		
	}
}
