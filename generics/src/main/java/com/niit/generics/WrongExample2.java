package com.niit.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hamcrest.core.Is;

public class WrongExample2 {
	public static void main(String ... args){
		// Create list
		List stamps = new ArrayList(); 
		// Add values ... 
		stamps.add(new Stamp("India",2016,true,200.00));
		stamps.add(new Coin("USA",2016,true,200.00,"Denver","Obverse Strike"));
		stamps.add(new Coin("USA",2014,true,200.00,"Philadelphia","Reverse Strike"));
		stamps.add(new Stamp("India",2017,false,400.00));
		// now how do we iterate??
		for (Iterator i = stamps.iterator(); i.hasNext();){
			Object c = (Object)i.next(); 
			if (c instanceof Stamp)
			System.out.println(c);// will now throw error at runtime.
		}
		
	}
}
