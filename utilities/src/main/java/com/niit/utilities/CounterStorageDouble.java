package com.niit.utilities;

public class CounterStorageDouble implements CounterStorage {

	public CounterStorageDouble() {
		// TODO Auto-generated constructor stub
	}

	private int number;
		  public void setNumber( int number ) {
		    this.number = number;
		  }
		  @Override 
		  public int getNumber() {
		    return number;
		  }
}
