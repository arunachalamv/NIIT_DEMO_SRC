package com.niit.stringsandarrays;

public class StringDemo {
	public static void main(String... args) { 
		String s1 = "Hello"; 
		String s2 = "World"; 
		s1.concat(s2); // Concatenating
		System.out.println(s1);// so what is s1 now???
		String s3 = s1; 
		s1 = s1.concat(s2); 
		System.out.println(s1);
		System.out.println(s3); 
		// all of it reference and values.. 
	}
}
