package com.niit.designpatterns;

// still will be created even if we want it or not... 
public class StaticBlockSingleton {
    private static final StaticBlockSingleton INSTANCE;
 
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("i was not expecting this!", e);
        }
    }
 
    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
 
    private StaticBlockSingleton() {
        // ...
    }
}