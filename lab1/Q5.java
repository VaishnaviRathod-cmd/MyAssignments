package lab1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		System.out.println("Enter an Integer");
		Scanner myObj = new Scanner(System.in);  
	    Q5 e = new Q5();
	     int n = myObj.nextInt();
	     System.out.println(e.calculateSum(n));

	}
   int calculateSum(int n) {
	   int sum=0;
	   int i=0;
	   if(n==1) {
		   sum+=3;
	   }
	   else if(n==2) {
		   sum+=8;
	   }
	   else {
		   sum=8;
		   i=3;
		   int j=6;
	   while (i<n+1){
			
			//checks if given no is divisible by 3 or 4
			if(j%3==0||j%5==0)
			{
				sum+=j;
				i++;
			}
			j++;
		}
	   }
	   return sum;
   }
}