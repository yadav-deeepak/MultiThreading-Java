package com.ashokit.threads;

public class ThreadExampleUsingRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}
	
	public static void main(String[] args) {
		ThreadExampleUsingRunnable tr = new ThreadExampleUsingRunnable();
		Thread t = new Thread(tr);
		
		Thread t1 = new Thread(new ThreadExampleUsingRunnable());
		
		t.start();
		t1.start();
	}

}
