package com.ashokit.synchronization;

public class MainClass {

	public static void main(String[] args) {
		HDFCBank kartikAccnt = new HDFCBank(7000);
		ATMThread ATM = new ATMThread(kartikAccnt);
		ATM.setName("ATM Thread");
		
		GooglePay googlePay = new GooglePay(kartikAccnt);
		googlePay.setName("GooglePay Thread");
		
		ATM.start();
		googlePay.start();
	}
}

// So when we make our withdraw and deposit methods synchronized then what will happen?
/*
 * So first ATM thread will acquire the lock and execute the withdraw method once the run() execution of the ATM Thread is completed it will release the lock 
 * then the googlePay thread will acquire the lock and execute the deposit method this will make sure that our data remains consistent and balance should be correct.
 */
