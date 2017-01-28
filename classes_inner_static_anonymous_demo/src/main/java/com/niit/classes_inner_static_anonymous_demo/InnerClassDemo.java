package com.niit.classes_inner_static_anonymous_demo;

public class InnerClassDemo {
	private int x; // not accesbile by NestedClass
	public InnerClassDemo() { 
		System.out.println("Hello World"); // standard default constructor
		x = 45; 
	}
	protected class InnerClass{
		public void myCode() { 
			System.out.println("Hello, my value is: "+x);
		}
	}
	public static void main(String [] args){ 
		// Cannot do this.. Why?? 
		//InnerClass  nc = new InnerClass(); // 
		InnerClassDemo nc = new InnerClassDemo(); 
		nc.new InnerClass().myCode();
		
	}
}
