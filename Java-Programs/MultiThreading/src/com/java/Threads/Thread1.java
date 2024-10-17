package com.java.Threads;

class Thread1 extends Thread
{  
public void run(){  
System.out.println("thread is running...");  
}  
public static void main(String args[]){  
Thread1 t1=new Thread1(); 
Thread1 t2=new Thread1();
t1.start(); 
t2.start();
 }  
}  