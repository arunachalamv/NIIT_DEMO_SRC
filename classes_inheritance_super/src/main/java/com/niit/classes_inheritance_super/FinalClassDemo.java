package com.niit.classes_inheritance_super;

public class FinalClassDemo {
	private FinalClass p;
	public FinalClassDemo() { 
		p = new FinalClass(); 
	}
	
	public int getX() { 
		return this.p.getX(); 
	}
	public int getY() { 
		return this.p.getY(); 
	}
	public void  setX(int x) { 
		this.p.setX(x); 
	}
	public void setY(int y) { 
		this.p.setY(y); 
	}
	public FinalClass getP() { 
		return this.p; 
	}
	// the below will not compile
	//public static FinalClass getFinalClass() {
		//return p; 
	//}
	public String toString(){ 
		return p.toString();
	}
	public static void main(String ... myargs){
		FinalClassDemo  p = new FinalClassDemo(); 
		p.setX(200);
		p.setY(400);
		System.out.println(p.getP());// What is the output??
		System.out.println(p);
	}
}
