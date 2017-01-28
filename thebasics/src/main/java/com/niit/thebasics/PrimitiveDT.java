package com.niit.thebasics;

public class PrimitiveDT {
	// entry point for program
public static void main(String... args){
	// Examples of declaration....
	/*short s1 = 23;
	short s2;
	s2 = 0;
	long l = 3L;
	double d = 12.34;
	float f = 12.34f;*/
	long x = 56_789; // what's it value
	// 56,789
	System.out.println(x);
	//char c = 'd';
     //unicode....
	char c  = '\u0906';//letter AA 
	System.out.println(c);
	// What gets printed out?
	// arrays...
	char [] c1 = {'\u0906','\u092E'}; 
	System.out.println(c1);
	// And here ?? 
	char [] c2 = {'\u0BA4','\u0BAE','\u0BBF','\u0BB4','\u0B82'};
	System.out.println(c2);
}
}
