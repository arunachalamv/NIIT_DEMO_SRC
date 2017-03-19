package org.threads;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Thread t1 = new Thread(new Adding(1,10));
        Thread t2 = new Thread(new Adding(1,50));
        Thread t3 = new Thread(new Adding(5,15));
        Thread t4 = new Thread(new Adding(10,20));
        Thread t5 = new Thread(new Adding(15,20));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
