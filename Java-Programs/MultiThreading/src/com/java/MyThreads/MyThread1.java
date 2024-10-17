//Runnable Interface

package com.java.MyThreads;

public class MyThread1 implements Runnable{
	
	public void run()
	{
		System.out.println("thread is running!!!");
	}
	
	public static void main(String[] args)
	{
		Runnable r=new MyThread1();
		
		Thread t=new Thread(r,"My new thread");
		t.start();
		
		String str=t.getName();
		System.out.println(str);
	}

}
