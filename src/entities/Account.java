package entities;

public class Account {
	
	protected Integer number; 
	protected String holder; //titular da conta
	protected Double balance; //saldo
	
	public Account () {
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}
	
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void withdraw(double amount) {
		balance -= amount; 
	}

	public void deposit(double amount) {
		balance += amount; 
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder "
				+ holder
				+ ", Balance "
				+ balance;				
	}
}