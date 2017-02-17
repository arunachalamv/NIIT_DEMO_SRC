package com.niit.generics; 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;

public class Stack<E> {
	
	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;
	@SuppressWarnings("unchecked")
	public Stack() {
		 elements = (E[])new Object[DEFAULT_INITIAL_CAPACITY];
	}
	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}
	public E pop() {
		if (size==0)
			throw new EmptyStackException();
		E result = (E) elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}
	
	// Wildcard type for parameter that serves as an E consumer
	public void popAll(Collection<? super E> dst) {
		while (!isEmpty())
			dst.add(pop());
	}
	
	public void pushAll(Iterable<? extends E> src) {
		for (E e : src)
		push(e);
	}
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		// My arsg are Sriram and Ravee
		for (String arg : args)
			stack.push(arg);
		// should print RAVEE SRIRAM
		while (!stack.isEmpty())
			System.out.println(stack.pop().toUpperCase());
		Stack<Number> numberStack = new Stack<Number>();
		Iterable<Integer> integers = Arrays.asList(1,2,3); 
		numberStack.pushAll(integers);
        Collection<Object> obj = new ArrayList<Object>(); 
        numberStack.popAll(obj);
        // should now print 3, 2,1 
        for(Object o:obj){
        	System.out.println(o);
        }
	}

}
