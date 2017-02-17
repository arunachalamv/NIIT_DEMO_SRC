package com.niit.generics; 
import java.util.Map; 
import java.util.List; 
import java.util.HashMap; 
import java.util.ArrayList; 
public class Main {

	public static <K,V> HashMap<K,V> newHashMap() {
		return new HashMap<K,V>();
		}

	public static void main(String[] args) {
		//Map<String, List<String>> p = new HashMap<String,List<String>>() ;
		Map<String, List<String>> p = newHashMap(); 
		List<String> a = new ArrayList<String>(); 
		a.add("Sriram"); a.add("Ravee");
		p.put("SevenStackManagement", a); 
		for (Map.Entry<String, List<String>> r: p.entrySet()) {
			for (String x: r.getValue()){
				System.out.println(x);
			}
		}
	}

}
