package com.niit.classes_inheritance_super;

public class SalariedEmployee extends Employee {
	private double salary; // Annual salary
	   
	   protected SalariedEmployee(String name, String address, int number, double salary) {
	      super(name, address, number);
		
	      setSalary(salary);
	   }
	   public double getSalary() {
		      return salary;
		   }
		   
		   public void setSalary(double newSalary) {
		      if(newSalary >= 0.0) {
		         salary = newSalary;
		      }
		   }
		   
		   public void mailCheck() {
			      System.out.println("Within mailCheck of Salary class ");
			      System.out.println("Mailing check to " + getName()
			      + " with salary " + salary);
			   }
		   public double computePay() {
			      System.out.println("Computing salary pay for " + getName());
			      return salary/52;
			   }
		   
			//cannot be done why. 
		   //private void doNothing() { 
				//System.out.println("Do nothing code..");
			//}

		   public static void main(String... args){
			      SalariedEmployee s = new SalariedEmployee("Sriram", "Chennai, TN", 3, 3600.00);
			      System.out.println("Call mailCheck using Salary reference --");   
			      s.mailCheck();
			      System.out.println("*****************");
			      Employee e = new SalariedEmployee("Neeraj Kumar", "Roseville, MN", 2, 2400.00);
			      System.out.println("Call mailCheck using Employee reference--");
			      e.mailCheck();
			      System.out.println("*****************");
			      Employee f = new Employee("Dheeraj", "San Diego, CA", 2);
			      System.out.println("Call mailCheck using Employee reference--");
			      f.mailCheck();
			      System.out.println("*****************");
			      System.out.println("Neeraj  is an Employee:"+ (e instanceof Employee)); 
			      System.out.println("Sriram  is an Employee:"+ (s instanceof Employee));
			      System.out.println("Dheeraj is an Employee:"+ (f instanceof Employee)); 
			      System.out.println("Neeraj  is an Employee:"+ (e instanceof SalariedEmployee)); 
			      System.out.println("Sriram  is an Employee:"+ (s instanceof SalariedEmployee));
			      System.out.println("Dheeraj is an Employee:"+ (f instanceof SalariedEmployee)); 

		   }
}
