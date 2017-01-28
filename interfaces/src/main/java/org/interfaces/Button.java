package org.interfaces;

public class Button implements Clickable, Accessible, Runnable{

public void print(){
	Clickable.super.print();
	Accessible.super.print();
}
public void run() { 
	
}
public void hide() { 
	System.out.println("I am not doing any hiding");
}
public void dosometing() {
	System.out.println();
}

public static void main(String[] args) {
	Button button = new Button();
	button.click();
	button.access();
	button.print();
}
}