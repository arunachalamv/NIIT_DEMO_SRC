package com.niit.exceptions;

public class Example4 {

	private static int getDiv(int x, int y) throws MyException{
		if (y==0) throw new MyException(); 
		return x/y; 
	}
	public static void main(String[] args) throws MyException {
		int result = getDiv(10,0);
		System.out.println("Result:"+result);
	}

}
