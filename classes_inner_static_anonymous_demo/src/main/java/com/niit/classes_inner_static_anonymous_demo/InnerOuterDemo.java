package com.niit.classes_inner_static_anonymous_demo;
class OuterClass {
    private OuterClass(int x) {
        System.out.println("x: " + x);
    }

    static class InnerClass {
        public static void test() {
        	new OuterClass(1);
        }
    }
}

public class InnerOuterDemo {
    public static void main(String[] args) {
    	OuterClass.InnerClass.test();
        // OuterClass outer = new OuterClass(1); // It is not possible to create outer instance from outside.
    }
}