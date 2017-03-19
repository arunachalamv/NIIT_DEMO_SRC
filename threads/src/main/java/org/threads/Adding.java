package org.threads;

class Adding implements Runnable{
    int a,b; 
    public Adding(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void run() {
        add(a,b);
    }
    public void add(int a, int b){
        int sum=0;
            for(int i=a;i<=b;i++){
                sum = sum+ a;
            }
            System.out.println("Sum of "+a+" to "+ b+" numbers = "+sum);    
    }
}
