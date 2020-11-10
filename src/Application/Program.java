package Application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1234, "Ivaldo", 0.0);
		BusinessAccount bacc = new BusinessAccount(12345, "Letícia", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(123456, "Caio", 0.0, 600.0);
		Account acc3 = new SavingsAccount(23456, "Sofia", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2; 
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BussinessAccount)acc3;
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0); //exemplo
			System.out.println("Loan!");
			
		}else if (acc3 instanceof SavingsAccount){
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance(); //exemplo
			System.out.println("Update!");
		}
		

	}

}
