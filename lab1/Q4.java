package lab1;

import java.util.Scanner;


public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an Integer");
		Scanner myObj = new Scanner(System.in);  
	    Q4 d = new Q4();
	     int x = myObj.nextInt();
	     d.primeNumbers(x);
	}
	
	void primeNumbers(int x) {
		if(x>=2)
			System.out.print(2+" ");
			for(int i=3;i<=x;i++) {
				boolean prime=true;
				//checks if given no is prime or not
				for(int j=2;j<=Math.sqrt(i);j++) {
					if(i%j==0) {
						prime =false;
						break;
					}
				}
				if(prime==true)
					System.out.print(i+" ");
			}
		
	}
	

}
