package com.niit.classes_inheritance_super;

public class UseNoMainMethodObject {
	public static void main(String... args){ // varargs... 
		// the below will not compile... why???  
		// NoMainMethod p = new NoMainMethod(); 
		// This will compile . Why? 
		NoMainMethod p0 = NoMainMethod.doSomeCode(3);
		NoMainMethod p1 = NoMainMethod.doSomeCode(3); 
		// what's the output?? 
		// are p0 and p1 the same objects?? 
		System.out.println("P0 ="  + p0+"("+p0.getX()+")");
		System.out.println("P1 ="  + p1+"("+p1.getX()+")");
		swap(p0,p1);
		System.out.println("P0 ="  + p0+"("+p0.getX()+")");
		System.out.println("P1 ="  + p1+"("+p1.getX()+")");
	    // repeat...
		p0 = NoMainMethod.doSomeCode(3);
		p1 = NoMainMethod.doSomeCode(5); 
		// what's the output?? 
		// are p0 and p1 the same objects?? 
		System.out.println("P0 ="  + p0+"("+p0.getX()+")");
		System.out.println("P1 ="  + p1+"("+p1.getX()+")");
		swap(p0,p1);
		System.out.println("P0 ="  + p0+"("+p0.getX()+")");
		System.out.println("P1 ="  + p1+"("+p1.getX()+")");
	
	}
	// why is this declared as static ??? 
	private static void swap(NoMainMethod p0, NoMainMethod p1){
		NoMainMethod tmp = p0; 
		p0 = p1; 
		p1 = tmp; // Ha we seapped it.... 
		System.out.println("SWAP P0 ="  + p0+"("+p0.getX()+")");
		System.out.println("SWAP P1 ="  + p1+"("+p1.getX()+")");

	}
}
