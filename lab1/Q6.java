package lab1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		System.out.println("Enter an Integer");
		Scanner myObj = new Scanner(System.in);  
	    Q6 f = new Q6();
	     int n = myObj.nextInt();
	     System.out.println(f.calculateDifference(n));

	}
	int calculateDifference(int n) {
		int Sum=0;int a=0;int b=0;
		for(int i=1;i<=n;i++) {
			a=a+i*i;
		}
		for(int i=1;i<=n;i++) {
			b=b+i;
		}
		b=b*b;
		Sum=a-b;
		return Sum;
	}
	

}