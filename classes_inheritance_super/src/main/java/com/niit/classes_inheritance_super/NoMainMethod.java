package com.niit.classes_inheritance_super;

// Is this valid code???
class NoMainMethod {
	int x; 
	 private NoMainMethod(){
		System.out.println("In constructor");
	}
	 private NoMainMethod(int x){
			System.out.println("In constructor for integer"); 
			this.x = x; 
		}
	 public int getX() { 
		 return x; 
	 }
	public static NoMainMethod doSomeCode(int x) { 
		NoMainMethod p = new NoMainMethod(x);
		return p; 
	}
}
