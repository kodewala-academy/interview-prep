package com.kodewala.threads;

import java.util.concurrent.locks.ReentrantLock;

class Counter
{
	int counter = 0;

	ReentrantLock reentrantLock = new ReentrantLock();

	// This method is not thread safe
	public void increment() // 200 lines of code , critical lines are 10 only
	{
		// 190 ......

		reentrantLock.lock();
		counter = counter + 1;
		reentrantLock.unlock();

		
		reentrantLock.lock();
		counter = counter - 1;
		reentrantLock.unlock();

		System.out.println("Counter.increment() " + Thread.currentThread().getName() + " counter - > " + counter);

	}
}

class MyThread extends Thread

{

	Counter counter;

	MyThread(Counter _counter)
	{
		this.counter = _counter;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 10; i++)
		{
			counter.increment();
		}
	}
}

public class SyncDemo
{

	public static void main(String[] args)
	{
		Counter counter = new Counter();
		MyThread t1 = new MyThread(counter);
		MyThread t2 = new MyThread(counter);

		t1.setName("T1");
		t2.setName("T2");

		t1.start();

		t2.start();
	}

}
