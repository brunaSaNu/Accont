package entities;

public class ProductCC {
	
	private int number;
	private String holder;
	private double balance;
	
	public ProductCC() {
		
	}
	
	public ProductCC(int number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public ProductCC(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
	}
	
	public void withdraw(double amount) {
		balance = balance - amount - 5.00;
	}
	
	public String toString() {
		return "Account " 
			+ number 
			+ ", Holder: " 
			+ holder 
			+ ", Balance: $ "
			+ String.format("%.2f", balance);
	}
}
