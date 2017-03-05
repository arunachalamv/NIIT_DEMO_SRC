package com.niit.exceptions;

public class Example3 {

	private static int getDiv(int x, int y){
		return x/y; 
	}
	public static void main(String[] args) {
		int result = getDiv(10,0);
		System.out.println("Result:"+result);
	}

}

