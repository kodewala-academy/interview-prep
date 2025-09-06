package com.kodewala.threads.prodcons;

class ProdCons
{
	private boolean isDataAvailable = false;

	public synchronized void produce() throws InterruptedException
	{
		while (isDataAvailable)
		{
			wait(); // It release the object lock and goes to waiting state.
		}
		System.out.println(" Data produced" + Thread.currentThread().getName());
		isDataAvailable = true;
		Thread.sleep(2000);
		notify();
	}

	public synchronized void consume() throws InterruptedException
	{
		while (!isDataAvailable)
		{
			wait();
		}
		System.out.println(" Data consumed" + Thread.currentThread().getName());
		isDataAvailable = false;
		Thread.sleep(2000);
		notify();
	}

}

class Producer extends Thread
{
	ProdCons prodCons;

	Producer(ProdCons _prodCons)
	{
		this.prodCons = _prodCons;
	}

	@Override
	public void run()
	{
		try
		{
			for (int i = 0; i < 15; i++)
			{
				prodCons.produce();
			}
		} catch (InterruptedException e)
		{

		}
	}

}

class Consumer extends Thread
{

	ProdCons prodCons;

	Consumer(ProdCons _prodCons)
	{
		this.prodCons = _prodCons;
	}

	@Override
	public void run()
	{
		try
		{
			for (int i = 0; i < 15; i++)
			{
				prodCons.consume();
			}
		} catch (InterruptedException e)
		{

		}
	}

}

public class MyProdConsDemo
{

	public static void main(String[] args)
	{
		ProdCons shared = new ProdCons();

		Producer producer = new Producer(shared);
		Consumer consumer = new Consumer(shared);
		producer.start();
		consumer.start();

	}

}
