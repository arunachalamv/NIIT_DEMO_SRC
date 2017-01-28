package com.niit.classes_inheritance_super;

public class Employee {
	private String name;
	private String address;
	private int number;

	protected final String getName() {// why protected?? only subclasses can invoke these.. 
		return name;
	}
	protected final void setName(String name) {
		this.name = name;
	}
	protected final String getAddress() {
		return address;
	}
	protected final void setAddress(String address) {
		this.address = address;
	}
	protected final int getNumber() {
		return number;
	}
	protected final void setNumber(int number) {
		this.number = number;
	}
	protected void doNothing() { 
		System.out.println("Do nothing code..");
	}
	public  Employee(String name, String address, int number) {
	      System.out.println("Constructing an Employee");
	      this.name = name;
	      // name = name; 
	      this.address = address;
	      this.number = number;
	   }

	   public void mailCheck() {
	      System.out.println("EMP... Mailing a check to " + this.name + " " + this.address);
	   }
}
