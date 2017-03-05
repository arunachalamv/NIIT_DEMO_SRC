package com.niit.exceptions;

import java.io.IOException;

public class Example5 {

	private static int getDiv(int x, int y) throws IOException, MyException {
		int z = 0; 
		if (z==5) throw new IOException() ; 
		try { 
			z = x/y;
		}
		catch (Exception e){
			throw new MyException(e, e.getLocalizedMessage()); 
		}
		finally { z = 0; } 
		return z; 
	}
	public static void main(String[] args) {
		try { 
			int result = getDiv(10,0);
			System.out.println("Result:"+result);
		}
		catch (MyException| IOException e){
			e.printStackTrace();
		}
	} 
}


