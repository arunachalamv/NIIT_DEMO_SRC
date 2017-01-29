package com.niit.designpatterns;

// 2 checks for nul... 
public class LazySingletonDoubleChecked {
	private static volatile LazySingletonDoubleChecked instance = null;
	 
    // private constructor
    private LazySingletonDoubleChecked() {
    }
 
    public static LazySingletonDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (LazySingletonDoubleChecked.class) {
                // Double check
                if (instance == null) {
                    instance = new LazySingletonDoubleChecked();
                }
            }
        }
        return instance;
    }
}
