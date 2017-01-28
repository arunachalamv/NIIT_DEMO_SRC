package com.niit.enums_static_and_fun_stuff;

public enum Day {
    SUNDAY(0,true), MONDAY(1,false), TUESDAY(2,false), WEDNESDAY(3,false),
    THURSDAY(4,false), FRIDAY(5,false), SATURDAY(6,true) ;
	private final int dayofWeek;
    private final boolean isHoliday; 
    
    public int getDayofWeek(){
    	return dayofWeek; 
    }
    public boolean isHoliday(){
    	return this.isHoliday; 
    }
    // Can only be private....
    private Day(int dayofWeek, boolean isHoliday){
    	this.dayofWeek  = dayofWeek; 
    	this.isHoliday = isHoliday; 
    }
    
    
}
