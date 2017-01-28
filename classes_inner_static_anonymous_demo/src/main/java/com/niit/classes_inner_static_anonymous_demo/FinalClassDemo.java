package com.niit.classes_inner_static_anonymous_demo;

import java.util.Objects;

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
	public boolean equals(Object o) { 
		if (this==o) return true; 
		if (o==null){ 
			return false; // why No check for this?
		}
		if (o.getClass()!=this.getClass()) return false; 
		FinalClassDemo p = (FinalClassDemo)o;
		return Objects.equals(this.getX(), p.getX()) && Objects.equals(this.getY(), p.getY()); 
	}
	public static void main(String ... myargs){
		String a = "some string"; 
		String b = "some string"; 
		System.out.println(a==b); // Was false in old correct JAvA - now true.. 

		FinalClassDemo  p = new FinalClassDemo(); FinalClassDemo  p1 = new FinalClassDemo(); 
		p.setX(200);p.setY(400);
		p1.setX(200);p1.setY(400);
		System.out.println(p.getP());// What is the output??
		System.out.println(p);
		System.out.println(p==p1); //has to be fals// 
		System.out.println(p.equals(p1));
			
	}
}
