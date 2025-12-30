package com.ashokit.threadpool;

public class TriggerEmailForPolicy implements Runnable{

	private Customer c ;
	TriggerEmailForPolicy(Customer c){
		this.c = c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		triggerEmail(c);
	}

	public void triggerEmail(Customer c) {
		System.out.println("Triggering Email to person");
		StringBuffer s = new StringBuffer();
		s.append("Hi"+c.customerName);
		s.append("for policy number "+c.policyNumber +"premium is due and premium amount is "+c.premium);
		s.append(" please pay before the due date to avoid late charges");
		//call the java mail api to trigger email.
	}
	
}
