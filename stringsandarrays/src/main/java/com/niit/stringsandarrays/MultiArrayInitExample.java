package com.niit.stringsandarrays;

public class MultiArrayInitExample {
	private int sum(int [][]b){ 
		int total =0; 
			for (int i = 0; i < b.length;i++){ 
				for (int j = 0; j < b[i].length;j++)
					total += b[i][j];
			}
		return total; 
	}
	
	private void assign(int [][]b){ 
		for (int i = 0; i < b.length;i++){ 
			for (int j = 0; j < b[i].length;j++)
				b[i][j] = i+j; // what is the array;
		}
     }
	private void print(int [][]b){ 
		for (int i = 0; i < b.length;i++){ 
			System.out.print("Row:"+i+"-->");
			for (int j = 0; j < b[i].length;j++)
				System.out.print(b[i][j]+",");
		     System.out.println("");
		}
	} 
		
	public static void main(String ... args){ 
		int [][] multi = new int[2][]; 
		MultiArrayInitExample b = new MultiArrayInitExample();
		try { 
			System.out.println(b.sum(multi));
		}
		catch (Exception e){ 
			System.out.println("Expected exception and we got it..");
		}
		// Causes exception... why??? 
		multi[0]  = new int[2]; 
		multi[1] = new int[3]; 
		b.assign(multi); // should now be 7
		System.out.println(b.sum(multi));
		b.print(multi); 
		// Yet Anoter way. 
		int [][] x = new int [][] {
				{1,2},
				{1},
				{3,4,5}
		};
		// sysout total = 1+2+1+3+4+5 = 16
		System.out.println(b.sum(x));
		}
	}
