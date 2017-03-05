package com.niit.exceptions;

public class Example2 {

	public static void main(String[] args) {
		int x  = 0; 
		int y  = 10; 
		try {
		System.out.println("Result: "+y/x);
		} 
		catch (Exception e){
			e.printStackTrace();
		}

	}

}
