package com.niit.exceptions;

public class Example4 {

	private static int getDiv(int x, int y) throws Exception{
		//if (y==0) throw new MyException(); 
		if (y==0) throw new Exception("Division by Zero");
		return x/y; 
	}
	public static void main(String[] args)  {
		int result =0;
		try { result = getDiv(10,0);}
		catch (Exception e) { } 
		System.out.println("Result:"+result);
	}

}
