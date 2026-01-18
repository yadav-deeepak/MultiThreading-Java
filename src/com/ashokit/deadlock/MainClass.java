package com.ashokit.deadlock;

public class MainClass {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		Thread1 t = new Thread1(obj1,obj2);
		Thread2 t1= new Thread2(obj1, obj2);
		t.setName("Thread 1");
		t1.setName("Thread 2");
		t.start();
		t1.start();
	}
}
