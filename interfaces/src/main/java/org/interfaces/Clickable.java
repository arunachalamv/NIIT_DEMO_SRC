package org.interfaces;

public interface Clickable {
	default void click(){
		System.out.println("click");
	}
 
	default void print(){
		System.out.println("Clickable");
	}
	public void dosometing(); 
	public void hide(); 
}
