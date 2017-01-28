package com.niit.stringsandarrays;

public class MultiArrayExample {
	
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
			for (int j = 0; j < b[i].length;j++)
				System.out.print(b[i][j]+",");
		     System.out.println("");
		}
}

	public static void main(String ... args){ 
		int   b[][]  = new int[2][3]; 
		MultiArrayExample obj = new MultiArrayExample();
		obj.assign(b); 
		System.out.println(obj.sum(b));
		obj.print(b); 
	}
}
