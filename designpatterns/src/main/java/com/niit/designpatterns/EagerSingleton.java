package com.niit.designpatterns;

// Will always be created... 
public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();
 
    // private constructor
    private EagerSingleton() {
    }
 
    public static EagerSingleton getInstance() {
        return instance;
    }
}