package com.multithreading;


import java.util.concurrent.atomic.AtomicInteger;


public class AtomicIntegerExample {

private AtomicInteger counter = new AtomicInteger(0);
	
	public void incremntCounter()
	{
		counter.incrementAndGet();//atomically increments by 1
	}
	
	public void decrementCounter()
	{
		counter.decrementAndGet();//atomically decremnts by 1 
	}
	
	public int getCounter()
	{
		return counter.get();//retreive the current value
	}
	public static void main(String[] args) {
		AtomicIntegerExample example = new AtomicIntegerExample();
		
		//create 10 threads that increment the counter
		
		for(int i=0;i<10;i++)
		{
			new Thread(()->example.incremntCounter()).start();
		}
		
		
		//create 5 threads that decrement the counter
		
		for(int i=0;i<5;i++) {
			new Thread(()->example.decrementCounter()).start();
		}
		
		//let the threads finish execution
		try {
			Thread.sleep(1000);//wait for 1 second for all threads to completed
			
		
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		
		//get the final value of the counter
	
		System.out.println("final counter value: "  + example.getCounter());
		
	}
}

	

