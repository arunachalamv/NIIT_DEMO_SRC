package com.niit.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DictionaryExample {
	public static void main(String... args){ 
		// Much like a map... 
		// Obsoleted... 
		// The following will no longer work
		//Dictionary<String,String> pDictionary = new Dictionary<String,String>();
		// A HashMap contains values based on the key.
		// It contains only unique elements.
		// It may have one null key and multiple null values.
		// It maintains no order.
		Map <String,Integer> map = new HashMap<String,Integer>(); 
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
