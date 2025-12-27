package com.ashokit.synchronization;

public class GooglePay extends Thread{

	private HDFCBank bankAccnt;
	
	public GooglePay(HDFCBank bankAccnt){
		this.bankAccnt = bankAccnt;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		bankAccnt.deposit(5000);
	}
}
