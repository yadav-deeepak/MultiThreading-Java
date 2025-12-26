package com.ashokit.threads;

public class ThreadExample extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
 		System.out.println("Hi");
	}
	
	ThreadExample(){
		super();
	}
	
	ThreadExample(String str){
		super(str);
	}

	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample("FirstThread");
		ThreadExample t2 = new ThreadExample("SecondThread");
		t1.start();
		t2.start();
	}
}
