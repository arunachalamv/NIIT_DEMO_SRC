package com.niit.classes_inner_static_anonymous_demo;

public class AbstractDemo extends Abstract{
	public void doSomeCode() { 
		System.out.println("doSomeCode() from AbstractDemo");
	}
	public static void main(String... args){
		// You cannot do this
		// Abstract x = new Abstract(); 
		Abstract x = new AbstractDemo(); // you can do this..
		// Why??? 
		x.doSomeCode();
		// Now when Abstract add more functionality, it's automatically 
		// available to you.. 
		x.doSomeCode2();
		
	}
}
