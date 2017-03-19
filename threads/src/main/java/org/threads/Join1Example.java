package org.threads;

public class Join1Example {
	public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "t1");
        Thread t2 = new Thread(new MyRunnable(), "t2");
        Thread t3 = new Thread(new MyRunnable(), "t3");
        t1.start(); 
         t2.start();
        t3.start(); 
	} 
}
