package application;

import java.util.Scanner;

import entities.ProductCC;


public class ProgramCC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there an initial deposit (y/n)? ");
		String yon = sc.next();

		ProductCC productCC;

		if(yon.equals("y")) {
			System.out.println("Enter initial deposit value: ");
			double balance = sc.nextDouble();
			productCC = new ProductCC(number, holder, balance);
		} else {
			productCC = new ProductCC(number, holder);
		}
		
		System.out.println("Account data: " + productCC);
		
		System.out.println("");
		
		System.out.println("Enter a deposit value: ");
		double amount = sc.nextDouble();
		productCC.deposit(amount);
		
		System.out.println("Updated account data: " + productCC);
		
		System.out.println("Enter a withdraw value: ");
		double amount2 = sc.nextDouble();
		productCC.withdraw(amount2);
		
		System.out.println("Updated account data: " + productCC);
		
		sc.close();
	}

}
