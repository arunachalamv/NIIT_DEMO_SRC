package com.niit.designpatterns;

public class Pizza {
	Pizza(int size) {  }        
	Pizza(int size, boolean cheese) {  }    
	Pizza(int size, boolean cheese, boolean pepperoni) {  }    
	Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon) { }	// And many more options.. Telescoping Constructor Anti Pattern. 
	Pizza (int size, boolean cheese, boolean pep, boolean bacon, boolean corn) {} 
	Pizza(){} 
	// Alternatives????.. 
	private int size;
	  private boolean cheese;
	  private boolean pepperoni;
	  private boolean bacon; 
	  private boolean corn; 
	  private boolean onions; 
	  public String toString(){ 
		  return String.format("Size: %d, Cheese: %s, Pepperoni; %s, Bacon: %s", size, cheese, pepperoni, bacon);  
	  }
	// Then use code like so
	// Pizza p = new Pizza(10); 
	// p.setCheese(true); p.setPepperoni(false);.. 
	// Not correct ?? Why????? 
	  public static class Builder {
		    //required
		    private final int size;

		    //optional
		    private boolean cheese = false;
		    private boolean pepperoni = false;
		    private boolean bacon = false;
		    private boolean corn = false; 
		    private boolean onions = false; 
		    public Builder(int size) {
		      this.size = size;
		    }
		    public Builder (int size, int x){
		    	this.size = size; 
		    	System.out.println(x);
		    }

		    public Builder cheese(boolean value) {
		      cheese = value;
		      return this;
		    }

		    public Builder pepperoni(boolean value) {
		      pepperoni = value;
		      return this;
		    }
		    public Builder corn(boolean  value){
		    	corn = value;
		    	return this;
		    }

		    public Builder bacon(boolean value) {
		      bacon = value;
		      return this;
		    }

		    public Pizza build() {
		      return new Pizza(this);
		    }
		  }

		  private Pizza(Builder builder) {
		    size = builder.size;
		    cheese = builder.cheese;
		    pepperoni = builder.pepperoni;
		    bacon = builder.bacon;
		    corn = builder.corn;
		  }
		  
		  public static void main(String [] args) { 
			  Pizza pizza = new Pizza.Builder(12,4)
			  .corn(true)
              .pepperoni(true)
             .bacon(true)
              .cheese(true)
              .build();
			  Pizza p  = new Pizza(12, true, false, false); 
              System.out.println(pizza.toString());
			  System.out.println(pizza);
			  Pizza pi1 = new Pizza.Builder(23).corn(true).build(); 
		  }
}
