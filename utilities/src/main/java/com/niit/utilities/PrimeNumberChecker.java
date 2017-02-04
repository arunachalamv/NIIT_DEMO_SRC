package com.niit.utilities;
public class PrimeNumberChecker {
	   public Boolean validate(final Integer primeNumber) {
		   if (primeNumber==1) return false; 
		   if (primeNumber!=2 && primeNumber%2==0)  return false; 
	      for (int i = 2; i < (primeNumber / 2); i++) {  
	         if (primeNumber % i == 0) {
	            return false;
	         }
	      }
	      return true;
	   }
	}