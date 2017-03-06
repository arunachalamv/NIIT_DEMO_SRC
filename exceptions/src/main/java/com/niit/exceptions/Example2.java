package com.niit.exceptions;

public class Example2 {

	public static void main(String[] args) {
		int x  = 2; 
		int y  = 10; 
		try {
		System.out.println("Result: "+y/x);
		} 
		catch (Exception e){
			System.out.println("Am trying to divide by 0");
			e.printStackTrace();
		}
		 finally { 
			System.out.println("Finally");
		}

	}

}
