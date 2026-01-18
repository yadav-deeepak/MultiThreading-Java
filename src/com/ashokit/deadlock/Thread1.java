package com.ashokit.deadlock;

public class Thread1 extends Thread{
	
	Object obj = null;
	Object obj1 = null;
	Thread1(Object obj, Object obj1){
		this.obj = obj;
		this.obj1 = obj1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	    System.out.println("Thread 1 is about to acquire lock on the object1");
	    synchronized(obj) {
	    	System.out.println("Thread 1 has acquired the lock on object 1");
	    	try {
	    		Thread.sleep(10000);
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	System.out.println("Thread1 is trying to acquire the lock on object 2");
	    	synchronized(obj1) {
	    		System.out.println("Thread1 has acquired the lock on object 2");
	    		
	    	}
	    	System.out.println("Thread1 has released the lock on object 2");
	    }
	    System.out.println("Thread1 has released the lock on object 1");
	}

	
}
