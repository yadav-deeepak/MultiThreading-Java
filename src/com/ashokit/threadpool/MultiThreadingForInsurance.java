package com.ashokit.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingForInsurance {

	public static void main(String[] args) {
		Customer c = new Customer("Kartik", "PL1234", 100000.00);
		Customer c1 = new Customer("Harish", "PL1252", 50000.00);
		Customer c2= new Customer("Ram", "PL1265", 200000.00);
		Customer c3 = new Customer("Raju", "PL1276", 30000.00);
		Customer c4 = new Customer("Ravi", "PL1223", 60000.00);
		Customer c5 = new Customer("Pintu", "PL1298", 300000.00);
		Customer c6 = new Customer("Tiklup", "PL1243", 500000.00);
		Customer c7 = new Customer("Tilak ", "PL1209", 110000.00);
		
		List<Customer> customerList = new ArrayList<>();
		customerList.add(c);
		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);
		customerList.add(c6);
		customerList.add(c7);
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		
		for(int i=0; i<customerList.size(); i++) {
			ex.execute(new TriggerEmailForPolicy(customerList.get(i)));
			
		}
		// Since the thread pool uses queue so threads will be assigned to the customer objects in a FIFO manner.
		
		// So here if we fetch data like this then it will take 10hrs let us suppose 
		// So we will use thread pool here with 4 threads so time will reduce to 2.5 because all the threads are running parallel
//		for(int i=0; i<customerList.size(); i++) {
//			
//		}
	}
	
	public static void triggerEmail() {
		 
	}
}
