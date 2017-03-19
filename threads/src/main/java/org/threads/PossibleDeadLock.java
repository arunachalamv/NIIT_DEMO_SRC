package org.threads;

public class PossibleDeadLock {
	public static void main(String ... args) { 
		ThreadRunner t1 = new ThreadRunner(); 
		ThreadRunner t2 = new ThreadRunner();
		ThreadRunner t3 = new ThreadRunner();
		/*Thread tx1 = new Thread(t1);
		Thread tx2 = new Thread(t2);
		Thread tx3 = new Thread(t3);
		tx1.start(); tx2.start(); tx3.start();*/ 
		
		 new Thread(t1).start();
		new Thread(t2).start();
		new Thread(t3).start();
		/*try { tx1.join(); 
		tx2.join(); 
		tx3.join(); 
		} catch (InterruptedException ex){
			ex.printStackTrace();
		}*/
		 
		System.out.println("Actually in Main..."+A.getAbc());
	}
}

class A {
	private static String abc = ""; 
	public static String getAbc() { return abc; } 
	public static void setAbc(String abc) {A.abc = abc;} 
}

class ThreadRunner implements Runnable { 
    @Override
    public void run() {
    	final Object b = new Object(); 
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(1000);
             System.out.println(Thread.currentThread().getName()+" is trying to set abc");
                synchronized (b) { A.setAbc(Thread.currentThread().getName());
                System.out.println("Abc should be:"+ A.getAbc());
                }
                // msg.notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }

}
