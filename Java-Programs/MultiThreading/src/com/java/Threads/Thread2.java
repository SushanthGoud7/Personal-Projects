package com.java.Threads;

public class Thread2 implements Runnable{  
public void run(){  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
	Thread2 t2=new Thread2();  
Thread t1 =new Thread(t2);   // passing t2 As an input.   
t1.start();  
 }  
}  