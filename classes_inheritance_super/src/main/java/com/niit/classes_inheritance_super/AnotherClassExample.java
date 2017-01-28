package com.niit.classes_inheritance_super;

public class AnotherClassExample {
	int c; 
	@SuppressWarnings("unused")
	public static void main(String []args){
		AnotherClassExample p0 = new AnotherClassExample(); 
		int x[] = new int[100];  
		System.out.println(p0.sum(x));// whats the output?? 
		int y ; // the program will NOT compile if below is se....... Why while c is allowed..
		//System.out.println("Y="+y);//what's the output??
		System.out.println("C="+p0.c); 
		System.out.println("GETX:"+p0.getX(0));// Which method??
		System.out.println("GETX:"+p0.getX(0L));// Which method??
		Object o1 = p0.getX(0); // SEE HOW JAVA BOXES/UNBOXES
		Object o2 = p0.getX(0L); 
		System.out.println(o1.getClass().getName());
		System.out.println(o2.getClass().getName());

	}
	public int getX(int x){
		return x;
	}
	public long getX(long x){
		return x; 
	}
	public int sum(int []x){
		int tmpSump = 0; 
		for (int i=0; i< x.length;i++){
			tmpSump += x[i]; 
		}
		return tmpSump; 
	}
	public long sum(long []x){ 
		long tmpSump = 0; 
		for (int i=0; i< x.length;i++){
			tmpSump += x[i]; 
		}
		return tmpSump; 
		
	}
	// The following cannot be overloaded.. why?? 
	//public int sum(int... x) { 
		//return 0; 
	//}
	// Neither can this...WY. 
//	public long sum(int... x){
//		long tmpSum = 0; 
//		return tmpSum; 
//	}
}
