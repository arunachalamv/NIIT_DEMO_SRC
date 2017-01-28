package com.niit.thebasics;

public class LoopConditionsExamples {
	
	private int sumFor(int... args){
		int sum = 0; 
		for (int i=0; i< args.length;) sum+=args[i++]; 
		// sum =0, sum 1 sum =3 sum = 6
		return sum; 
	}
	
	private int sumWhile(int... args) { 
		int sum = 0; 
		int i =0; 
		while (i<args.length){ 
			sum += args[i++];//args[i]++ 
			i++; 
		}
		return sum; 
	}
	/**
	 * @return sum of all numbers from 1 to 10 except 2,3,5
	 */
	private int testSum(){ 
		int sum = 0 ; 
		int [] x = {1,2,3,4,5,6,7,8,9,10}; 
		for (int i = 0; i < x.length;i++){ 
			if (x[i]==2 || x[i]==3 || x[i]==5) continue; 
			sum += x[i]; 
		}
		// should be 55 -2 -3 -5 = 45
		// Continue will go back to start of loop. 
		return sum; 
	}
	private char getGrades(int testscore){ 
		char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade; 
	}
	
    public static void main(String [] args){ 
    	LoopConditionsExamples a = new LoopConditionsExamples(); 
    	System.out.println("For sum: "+a.sumFor(1,2,3)); 
    	System.out.println("While sum: "+a.sumWhile(1,2,3)); 
    	int [] ab = new int[]{1,2,3}; // how to set up an array...
    	System.out.println("For array sum: "+a.sumFor(ab)); 
    	System.out.println("While array sum: "+a.sumWhile(ab));
    	System.out.println("Student Grade:"+a.getGrades(76));
    	System.out.println("TEST SUM:"+a.testSum());
    }
}
