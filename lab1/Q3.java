package lab1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the nth fibonnaci number you want to find");
		Scanner myObj = new Scanner(System.in);  
	    Q3 c = new Q3();
	     int x = myObj.nextInt();
	     c.FibonacciNonRecursive(x);
 //System.out.println();//sysout ctrl space
	     for(int i=1;i<=x;i++) {
	    	 System.out.print(c.RecursiveFibonacci(i)+" ");;
	     }
		
	}
	void FibonacciNonRecursive(int x) {
		int a,b,c;
		a=1;b=1;
		if(x<=0)
			System.out.println("Enter valid Input");
		else {
			int z=2;
		while(x!=0) {	
			if(z!=0) {
				System.out.print(a+" ");
				z--;x--;
			}
			else {
			c=b;
			b=a+b;
			a=c;
			System.out.print(b +" ");
			x--;
			}
		}
		
		}
		
	}
	
	int RecursiveFibonacci(int x) {
		if(x==1||x==2)
			return 1;
		else 
			return RecursiveFibonacci(x-1)+RecursiveFibonacci(x-2);
	}

 
}

