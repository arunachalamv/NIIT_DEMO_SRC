package com.niit.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String ... args){
		List<Object> objArray = new ArrayList<Object>(); 
		ObjectA a = new ObjectA(); a.setAge(30);
		ObjectB b = new ObjectB(); b.setAge(20); b.setName("Sriram");
		ObjectA c = new ObjectA(); c.setAge(45);
		objArray.add(a); 
		objArray.add(b);
		objArray.add(c); 
		System.out.println(objArray);
	}
}

class ObjectA {
	private int age; 
	public int getAge(){ return age; } 
	public void setAge(int age){ this.age = age; }
	public String toString() { 
		return String.format("Age:%d",age);
	}
}

class ObjectB{
	private int age; 
	private String name; 
	public int getAge(){ return age; } 
	public void setAge(int age){ this.age = age; }
	public String getName() { return name; } 
	public void setName(String name) { this.name = name;} 
	public String toString() { 
		return String.format("Name, %s,Age:%d",name, age);
	}
}
