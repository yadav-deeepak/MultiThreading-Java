package com.ashokit.synchronization;

public class SynchronizedExample {

	synchronized void display(SynchronizedExample d) {
		System.out.println("Hi1");
		System.out.println("Hi2");
		System.out.println("Hi3");
		System.out.println("Hi4");
	}
	// When display method will start executing it will acquire the lock then no other thread will be able to execute display method 
	// They will enter into the waiting mode.
	
	void display1(SynchronizedExample d) {
		System.out.println("hi 1");
	 	System.out.println("hi 2");
	 	synchronized(d) {
	 		System.out.println("hi3");
	 		System.out.println("hi4");
	 	}
	}
	
	public static void main(String[] args) {
		//Creating thread object by creating anonymous inner class.
		SynchronizedExample s = new SynchronizedExample();
//		Thread t = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				s.display(s);
//			}
//			
//		}); 
		// or we can also create the thread using java 8 
		Thread t = new Thread(()->s.display(s));
		t.start();
	}
	
	// Here in the second scenario our method is not synchronized so all the threads can execute line number
	//14 and 15 but one thread will enter into the line number 16 and other threads will enter the wait mode. 
}

/*
 * When we want to make some part of the method as synchronized then
 * we dont need to use synchronized method then we will use synchronized block.
 * Using synchronized block we can make the particular line of code as synchronized
 * 
 * 
 * */
 