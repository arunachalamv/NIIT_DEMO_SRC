package com.niit.exceptions;

import java.io.IOException;
import com.niit.utilities.LoggerStackTraceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Example5 {

	private static final Logger LOG =LoggerFactory.getLogger(Example5.class); 
	private static int getDiv(int x, int y) throws Exception,IOException, MyException {
		int z = 0; 
		try { 
			z = x/y;
			if (z==5) throw new Exception() ;
		}
		catch (Exception e){
			LOG.info(new LoggerStackTraceUtil().getErrorMessage(e));
			if (z==5) throw new IOException(); 
			else
			throw new MyException(e, e.getLocalizedMessage()); 
		}
	
		finally { z = 0; } 
		return z; 
	}
	public static void main(String[] args) throws Exception {
		try { 
			int result = getDiv(10,0);
			System.out.println("Result:"+result);
		}
		catch (MyException| IOException e){
			//e.printStackTrace();
			//LOG.info(new LoggerStackTraceUtil().getErrorMessage(e)); 
		}
	} 
}


