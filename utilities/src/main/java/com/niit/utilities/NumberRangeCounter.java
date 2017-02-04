package com.niit.utilities;

public class NumberRangeCounter {

	 private static final int LOWER_BOUND = 1000;
	  private static final int RANGE = 1000;
	  private static final int ZERO_RANGE = 0;
	  
	  public NumberRangeCounter() {
		// TODO Auto-generated constructor stub
	}

	  public NumberRangeCounter(int lower, int range){
		  int []arr;
		  arr = new int[lower*range]; 
		  for (int i  = 0; i < lower*range-1;i++){
			  arr[i] = i+1; 
		  }
	  }
	  
	  public NumberRangeCounter(CounterStorage c, int lower, int range){
		  int []arr;
		  arr = new int[lower*range]; 
		  for (int i  = 0; i < lower*range-1;i++){
			  arr[i] = i+1; 
		  }
	  }
	public int next() {
			    return 0;
			  }
}
