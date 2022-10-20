package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		int n;
		System.out.println("Enter size of array");
		Scanner myObj = new Scanner(System.in); 
	     n = myObj.nextInt();
	     
	     System.out.println("Enter the array elements");
	     int[] arr = new int[n];
	     for(int i=0;i<n;i++) {
	    	 arr[i]=myObj.nextInt();
	     }
	     Exercise3 c = new Exercise3();
	 arr=c.reverseArray(arr);
	 for(int i=0;i<n;i++) {
    	 System.out.print(arr[i]+" ");
     }

	}
	int[] reverseArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int reversed=0;
			while(num != 0) {
			    		      
			      int digit = num % 10;
			      reversed = reversed * 10 + digit;

			      num /= 10;
			    }
			arr[i]=reversed;
		}
		Arrays.sort(arr);
        System.out.println("\nThe sorted array is: ");
        
		return arr;
	}

}
