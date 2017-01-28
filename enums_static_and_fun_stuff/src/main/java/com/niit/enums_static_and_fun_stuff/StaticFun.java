package com.niit.enums_static_and_fun_stuff; // package.... 

/**
 * @author sesha
 *
 */
public class StaticFun {
   public static int x=1; 
   static {// just after the system has styarted. ... 
	   System.out.println("setting x to 5");
	   x=5; 
   }
   { 
	   x=3; 
	   System.out.println("x =="+x) ;
   }
   static { 
	   x = 6; 
	   System.out.println("Resetting x=6");
   }
   { 
	   x = 4; 
   }
   private static int getX(){
	   return x;
   }
   //@SuppressWarnings("unused") // Annotations.. 
//@SuppressWarnings("unused")
public static void main(String... args){ // why is main public
	   new StaticFun(); 
	   System.out.println(StaticFun.getX());
	   new StaticFun(); 
	   System.out.println(StaticFun.getX());
	   new StaticFun();
	    System.out.println(StaticFun.getX());
   }
}
