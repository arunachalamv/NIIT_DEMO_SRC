package com.niit.generics;

import java.util.ArrayList;
import java.util.List;

public class CorrectExample {
	public static void main(String ... args){
		// Create list
		List <Stamp>stamps = new ArrayList<Stamp>(); 
		// Add values ... 
		//stamps.add("sriram");
		stamps.add(new Stamp("India",2016,true,200.00));
		// Now below 2 lines will ***** NOT COMPILE ***
		//stamps.add(new Coin("USA",2016,true,200.00,"Denver","Obverse Strike"));
		//stamps.add(new Coin("USA",2014,true,200.00,"Philadelphia","Reverse Strike"));
		stamps.add(new Stamp("India",2017,false,400.00));
		// now how do we iterate only over stamps and not coins??
		for (Stamp c: stamps){
			System.out.println(c);
		}
		int arr[] = new int[] {3,4,5};
		for (int i:arr){// for (int i =0; i<arr.length;i++)
			System.out.println(i);
		}
		
	}
}

