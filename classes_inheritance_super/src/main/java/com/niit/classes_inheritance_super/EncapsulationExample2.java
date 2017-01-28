package com.niit.classes_inheritance_super;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

public class EncapsulationExample2 {
	public static void main(String... args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException { 
		EncapsulationExample1 e = new EncapsulationExample1(); 
		e.setX(100);e.setY(200);// Z will always be 0.
		System.out.println("e value... "+e);
		// how to change this value??? hack.... 
		// You can also change final value this way...
		// Never recommended.. 
		for (Field f: e.getClass().getDeclaredFields()){
			if (f.getName().equalsIgnoreCase("z")){ 
				Type t = f.getType(); 
				f.setAccessible(true);
				switch(t.getTypeName()){
					case "int": f.setInt(e, 300); break;
					case "long": f.setLong(e, 200L);break;
					default: // do nothing.. 
				}
			}
		}
		System.out.println("e value... "+e);
	}
}
