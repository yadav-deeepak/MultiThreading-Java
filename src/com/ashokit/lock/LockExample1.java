package com.ashokit.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import com.ashokit.synchronization.SynchronizedExample;

public class LockExample1 {

	private Lock l = new ReentrantLock();
	
	synchronized void display(LockExample1 d) {
		//CreateLock
		l.lock();
		System.out.println("Hi1");
		System.out.println("Hi2");
		System.out.println("Hi3");
		System.out.println("Hi4");
		l.unlock();
	}
	
//	void display1(SynchronizedExample d) {
//		System.out.println("hi 1");
//	 	System.out.println("hi 2");
//	 	//Release Lock
//	 	l.unlock();
//	 	synchronized(d) {
//	 		System.out.println("hi3");
//	 		System.out.println("hi4");
//	 	}
//	}
	
	public static void main(String[] args) {
		LockExample1 l1= new LockExample1();
		Thread t = new Thread(()-> l1.display(l1));
		Thread t1 = new Thread(()-> l1.display(l1));
		Thread t2= new Thread(()-> l1.display(l1));
		Thread t3 = new Thread(()-> l1.display(l1));
		
		t.start();
		t1.start();
		t2.start();
		t3.start();
		
	}
	 It will behave the same when one thread will acquire the lock the other threads have to wait.
	 Here by using this lock interface we can make some changes in our Reentrant class lock method to make sure that the thread which is waiting for longer
	 period of time gets the lock first . So this solves one of the problem or drawback of the synchronized keyword.
	 so based on the waiting time of the thread we want to do acquire the lock 
	 How we can do this we will pass true as an argument to the ReentrantLock it has a constructor 
	
	
}
