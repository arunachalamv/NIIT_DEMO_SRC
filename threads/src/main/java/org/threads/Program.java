package org.threads;

class Program {
	public static void main(String [] args) {
		Output thr1 = new Output("Hello");
		Output thr2 = new Output("There");
		thr1.start();
		thr2.start();
	}
}

class Output extends Thread {
	private String toSay;
	public Output(String st) {
		toSay = st;
	}
	public void run() {

		try {
			for(;;) {
				//System.out.println(toSay);
				
				
				sleep(1000);
			}
		} catch(InterruptedException e) {
			//System.out.println(e);
		}
	}
}

