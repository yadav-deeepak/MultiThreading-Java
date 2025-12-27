package com.ashokit.synchronization;

public class HDFCBank {

	int accountBalance; 
	public HDFCBank(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	synchronized public void withdraw(int withdrawalAmount) {
		accountBalance = this.accountBalance - withdrawalAmount;
	}
	
	synchronized public void deposit(int amountToBeDeposited) {
		accountBalance = this.accountBalance + amountToBeDeposited;
	}
}
