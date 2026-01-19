package com.ashokit.join;

public class JoinExample {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Run method executed");
			}
			
		});
		t.start();
		System.out.println("Hiii");
		System.out.println("Hello");
	}
}
