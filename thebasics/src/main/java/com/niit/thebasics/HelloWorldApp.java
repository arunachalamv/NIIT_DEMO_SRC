package com.niit.thebasics; 
public class HelloWorldApp { 
	// Constructor... 
	int  abc;
	public HelloWorldApp() { 
		System.out.println("Is this an object?:"+(this instanceof Object));
	}
	public HelloWorldApp(int x){abc=x;}
	
	public static void main (String [] args){ 
		System.out.println("Hello World");
		HelloWorldApp p = new HelloWorldApp(); 
		// the below will not work...
		//System.out.println(this instanceof Object);
		// this will work below. 
		System.out.println(p instanceof Object); 

	} 
} 