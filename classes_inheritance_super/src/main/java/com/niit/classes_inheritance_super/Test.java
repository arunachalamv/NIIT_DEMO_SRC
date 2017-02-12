package com.niit.classes_inheritance_super;
public class Test {
	public static void main(String[] args) {
        Foo f = new Bar();
        f.instanceMethod();
        //f.classMethod();// Will call FOO not Bar
        // Deliberately left the above to show warnings.. Clean it up!!!
        // to call Bar, dothis
        Bar.classMethod();
        // to explicity call Foo
        Foo.classMethod();
        // or alternatively 
    }
}

class Foo {
    public static void classMethod() {
        System.out.println("classMethod() in Foo");
    }
 
    public void instanceMethod() {
        System.out.println("instanceMethod() in Foo");
    }
}
 
class Bar extends Foo {
    public static void classMethod() {
    	 // The below will never work!!!!
    	//super.classMethod();
        System.out.println("classMethod() in Bar");
    }
    //This will not work!!! So you 
    //public void classMethod() { 
    	
    //}
 
    public void instanceMethod() {
    	// why would you want to do this??
    	super.instanceMethod();// This will work... 
        System.out.println("instanceMethod() in Bar");
    }
}

