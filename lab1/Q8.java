package lab1;

import java.util.Scanner;


public class Q8 {

	public static void main(String[] args) {
		// 2,4,8,16,32,64,
		System.out.println("Enter an Integer");
		Scanner myObj = new Scanner(System.in);  
	    Q8 h = new Q8();
	     int n = myObj.nextInt();
	     System.out.println(h.checkNumber(n));
	}
	boolean checkNumber(int n) {
		if (n == 0)
	        return false;
	 
	    return (Math.ceil(Math.log(n)/Math.log(2)) == Math.floor(Math.log(n)/Math.log(2)));
	}
}
