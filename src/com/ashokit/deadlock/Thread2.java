package com.ashokit.deadlock;

public class Thread2 extends Thread{
	
	Object obj = null;
	Object obj1 = null;
	Thread2(Object obj, Object obj1){
		this.obj = obj;
		this.obj1 = obj1;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	    System.out.println("Thread 2 is about to acquire lock on the object2");
	    synchronized(obj1) {
	    	System.out.println("Thread 2 has acquired the lock on object 2");
	    	try {
	    		Thread.sleep(10000);
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	System.out.println("Thread2 is trying to acquire the lock on object 1");
	    	synchronized(obj) {
	    		System.out.println("Thread2 has acquired the lock on object 1");
	    		
	    	}
	    	System.out.println("Thread2 has released the lock on object 1");
	    }
	    System.out.println("Thread2 has released the lock on object 2");
	}

	
}
