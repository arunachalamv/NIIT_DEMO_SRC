package com.niit.exceptions;

import java.io.IOException;
import com.niit.utilities.*; 
public class Example6 {

	private static int getDiv(int x, int y) throws IOException, MyException {
		int z = 0; 
		if (z==5) throw new IOException() ; 
		try { 
			z = x/y;
		}
		catch (Exception e){
			throw new MyException(e, e.getMessage()); 
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
			//LoggerStackTraceUtil u = new LoggerStackTraceUtil(); 
			//System.out.println(u.getErrorMessage(e));
			LoggerStackTraceUtil.printErrorMessage(e);
		}
	} 
}


