package com.ashokit.synchronization;

public class ATMThread extends Thread {
	
	private HDFCBank bankAccount;
	public ATMThread(HDFCBank bankAccount){
		this.bankAccount = bankAccount;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccount.withdraw(4000);
	}

}
