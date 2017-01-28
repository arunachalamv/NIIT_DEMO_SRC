package com.niit.classes_inner_static_anonymous_demo;

public final class FinalClass {
	// From no one.. you cannot write 
	// public class X extends FinalClass
	private int x; 
	private int y;
	private final int z = 20; 
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
	public int getZ() {
		return z;
	} 
	public String toString() { 
		StringBuffer p = new StringBuffer(); 
		p.append("X=");p.append(x); p.append(",");
		p.append("Y=");p.append(y); p.append(",");
		p.append("Z=");p.append(z);
		return p.toString(); 
		// Why is this better than x=+y+=z+=
	}
}
