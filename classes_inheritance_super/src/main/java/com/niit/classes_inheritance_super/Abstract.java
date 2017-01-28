package com.niit.classes_inheritance_super;

public abstract class Abstract {
	private int x = 20; 
	private int y = 20;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	} 
	public void doSomeCode() { 
		System.out.println("doSomeCode() from Abstract");
	}
	public void doSomeCode2() { 
		System.out.println("doSomeCode2() from "+this.getClass().getName()); 
	} 
}
