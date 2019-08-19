package org.tektutor;



public class SavingsAccount {
	
	public double getBalance() {
		System.out.println("Balance is retrieved from database");
		return 7000.00;
	}
	
	public double withdraw(double amountToBeWithdrawn) throws InsufficiantBalanceException{
		System.out.println("Inside withdraw method");
		
		double currentBalance = getBalance();
		if(amountToBeWithdrawn < currentBalance)
			currentBalance = currentBalance - amountToBeWithdrawn;
		else
			throw new InsufficiantBalanceException();
		
		updateBalanceIntoDB(currentBalance);
		
		return currentBalance;
	}
	
	public void updateBalanceIntoDB(double currentBalance) {
		System.out.println("balance is updated in database");
	}

}
