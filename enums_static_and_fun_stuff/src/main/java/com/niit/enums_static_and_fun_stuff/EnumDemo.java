package com.niit.enums_static_and_fun_stuff;

public class EnumDemo {
	public static void main(String [] args){
		System.out.println("The days of the week are:");
		String sep=",";
		int i=0; 
		for (Day p:Day.values()){
			if(i==Day.values().length-1) sep="";
			System.out.print(p+sep);
			i++; 
		}
		System.out.println("\nThe number of days in a week are: "+Day.values().length);
		System.out.println(String.format("Saturday Infomation==>Day of Week, %02d, isHoliday: %s", Day.SATURDAY.getDayofWeek(), Day.SATURDAY.isHoliday())); 
		System.out.println(String.format("Friday   Infomation==>Day of Week, %02d, isHoliday: %s", Day.FRIDAY.getDayofWeek(), Day.FRIDAY.isHoliday())); 
	}
}
