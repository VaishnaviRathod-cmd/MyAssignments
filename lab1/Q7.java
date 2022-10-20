package lab1;

import java.util.Scanner;


public class Q7 {

	public static void main(String[] args) {
		System.out.println("Enter an Integer");
		Scanner myObj = new Scanner(System.in);  
	    Q7 g = new Q7();
	     int n = myObj.nextInt();
	     //System.out.println(12345%100);
	     System.out.println(g.checkNumber(n));

	}
       boolean checkNumber(int n) {
    	   int reversed = 0;
    	    
    	    //System.out.println("Original Number: " + n);

    	    // run loop until n becomes 0
    	    while(n != 0) {
    	    
    	      // get last digit from n
    	      int digit = n % 10;
    	      reversed = reversed * 10 + digit;

    	      // remove the last digit from n
    	      n /= 10;
    	    }
    	   // System.out.println("Reverse number "+reversed);
    	    int a=reversed%10;
    	    boolean flag=true;
    	    reversed =reversed/10;
    	    //System.out.println("a "+a+" reversed "+reversed);
    	   
    	   while(reversed!=0) {
    		   int b=reversed%10;
    		   if(a>b)
    		   {
    			   flag=false;
    			   break;
    		   }
    		   a=b;
       	    reversed =reversed/10; 
       	    b=reversed%10;
    	   }
    	   return flag;
       }
}
