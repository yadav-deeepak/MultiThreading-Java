package com.ashokit.join;

public class ThreadLocalExample {

	static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				threadLocal.set(100);
				System.out.println(threadLocal.get());
			} 
		});
	}
}
