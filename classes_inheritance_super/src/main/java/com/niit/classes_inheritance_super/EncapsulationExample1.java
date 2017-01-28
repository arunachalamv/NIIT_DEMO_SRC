package com.niit.classes_inheritance_super;

public class EncapsulationExample1 {
	private int x; 
	private int y; 
	private int z; // this can only be called by itself.. 

	int getX() {  
		return x;
	}
	void setX(int x) {
		this.x = x;
	}
	int getY() {
		return y;
	}
	void setY(int y) {
		this.y = y;
	}
	public String toString() { 
		return String.format("X: %03d,Y=%03d,Z=%03d",x,y,z);
	}
	public static void main(String... args) { 
		EncapsulationExample1 e = new EncapsulationExample1(); 
		e.setX(100);e.setY(200);// Z will always be 0.
		System.out.println("e value... "+e);
	}
}
