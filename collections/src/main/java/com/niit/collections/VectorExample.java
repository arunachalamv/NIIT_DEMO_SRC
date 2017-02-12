package com.niit.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String... args){ 
		// vectors are synchronized.. 
		// Not used so much now.. 
		int []p = {3,4,5}; 
		// use of generics
		Vector <Integer>pVector  = new Vector<Integer>(); 
		for (int i:p){
			pVector.add(i); 
		}
		pVector.remove(1); // remove 4 from list
		Iterator<Integer> it = pVector.iterator(); 
		while (it.hasNext()){
			int i = (Integer)it.next(); 
			System.out.println(i);
		}
	}
}
