package com.niit.collections;

import java.util.NoSuchElementException;

public class DoubleLinkedList<E> {
	 	private Node head;
	    private Node tail;
	    private int size;
	    public DoubleLinkedList() {
	        size = 0;
	    }
	    private class Node {
	        E element;
	        Node next;
	        Node prev;
	 
	        public Node(E element, Node next, Node prev) {
	            this.element = element;
	            this.next = next;
	            this.prev = prev;
	        }
	    }
	    /**
	     * returns the size of the linked list
	     * @return
	     */
	    public int size() { return size; }
	     
	    /**
	     * return whether the list is empty or not
	     * @return
	     */
	    public boolean isEmpty() { return size == 0; }
	     
	    /**
	     * adds element at the starting of the linked list
	     * @param element
	     */
	    public void addFirst(E element) {
	        Node tmp = new Node(element, head, null);
	        if(head != null ) {head.prev = tmp;}
	        head = tmp;
	        if(tail == null) { tail = tmp;}
	        size++;
	        System.out.println("****adding: "+element);
	    }
	     
	    /**
	     * adds element at the end of the linked list
	     * @param element
	     */
	    public void addLast(E element) {
	         
	        Node tmp = new Node(element, null, tail);
	        if(tail != null) {tail.next = tmp;}
	        tail = tmp;
	        if(head == null) { head = tmp;}
	        size++;
	        System.out.println("****adding: "+element);
	    }
	     
	    /**
	     * this method walks forward through the linked list
	     */
	    public void iterateForward(){
	         
	        System.out.println("*****iterating forwards..");
	        Node tmp = head;
	        while(tmp != null){
	            System.out.println(tmp.element);
	            tmp = tmp.next;
	        }
	    }
	     
	    /**
	     * this method walks backward through the linked list
	     */
	    public void iterateBackward(){
	         
	        System.out.println("*****iterating backwards..");
	        Node tmp = tail;
	        while(tmp != null){
	            System.out.println(tmp.element);
	            tmp = tmp.prev;
	        }
	    }
	    public E removeElement(E element){
	        if (size == 0) throw new NoSuchElementException();
	        Node tmp = head;
	        Node tmp2 = head; 
	        while (tmp.next!=null){
	        	if (tmp.element==element){
	        		if(tmp.prev!=null) tmp.prev.next = tmp.next; 
	        		if(tmp.next !=null) tmp.next.prev = tmp.prev;
	        		tmp2 = tmp.prev;
	        		tmp = null; 
	        		System.out.println("*****deleted "+element);
	        		break; 
	        	}
	        	tmp = tmp.next; 
	        }
	        return tmp2.element; 
	    }
	    public E removeFirst() {
	        if (size == 0) throw new NoSuchElementException();
	        Node tmp = head;
	        head = head.next;
	        head.prev = null;
	        size--;
	        System.out.println("*****deleted: "+tmp.element);
	        return tmp.element;
	    }
	     
	    /**
	     * this method removes element from the end of the linked list
	     * @return
	     */
	    public E removeLast() {
	        if (size == 0) throw new NoSuchElementException();
	        Node tmp = tail;
	        tail = tail.prev;
	        tail.next = null;
	        size--;
	        System.out.println("*****deleted: "+tmp.element);
	        return tmp.element;
	    }
	     
	    public static void main(String a[]){
	         
	        DoubleLinkedList<String> dll = new DoubleLinkedList<String>();
	        dll.addFirst("David");
	        dll.addLast("Joshua");
	        dll.addLast("Miriam");
	        dll.iterateForward();
	        dll.removeElement("Joshua");
	        //dll.removeFirst();
	        //dll.removeLast();
	        dll.iterateBackward();
	    }
}
