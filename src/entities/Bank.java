package entities;

public class Bank {
	
	private int number;
	private String holder;
	private double balance;
	
	//construtores
	public Bank(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}
	public Bank(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public String getHolder() {
		return holder;
	}
	
	public double getNumber() {
		return number;
	}
	
	public double getBalance() {
		return balance;
	}
	  
	
	//metodos
	public void deposit(double depositValue) {
		balance += depositValue;
	}
	
	public void withdraw(double withdrawValue) {
		balance -= withdrawValue + 5.0;
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
