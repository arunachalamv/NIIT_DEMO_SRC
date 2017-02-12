package com.niit.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableExample {
	public static void main(String [] args){ 
		//A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
		//It contains only unique elements.
		//It may have not have any null key or value.
		//It is synchronized.
		Hashtable<String, Integer> map = new Hashtable<String, Integer>() ;
		map.put("Sriram",47); 
		map.put("Ravee",52); 
		 for (Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator(); iterator
				.hasNext();) {
			Map.Entry <String,Integer>m = iterator.next();
			System.out.println(m.getKey()+", Age:"+m.getValue());
		}  
		 // Old fashioned code.. 
		 // for(Map.Entry m:hm.entrySet()){  
		   //System.out.println(m.getKey()+" "+m.getValue());  
	  //}
	}
}
