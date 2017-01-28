package com.niit.classes_inner_static_anonymous_demo;

 public class Theatre {
   public  static int NumberofPeople=5; 
   public int x; 
   public void enter() { 
	   Theatre.NumberofPeople++; 
   }
   public void leave() { 
	   NumberofPeople--; 
   }
   public static int getX() { 
	   return NumberofPeople;
   }
}
