package lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		int n;
		System.out.println("Enter size of array");
		Scanner myObj = new Scanner(System.in); 
	     n = myObj.nextInt();     
	     System.out.println("Enter the array of String objects");
	     String[] arr = new String[n];
	     for(int i=0;i<n;i++) {
	    	 arr[i]=myObj.next();
	     }
	     Exercise2 b = new Exercise2();
	     arr= b.sortStrings(arr);
	     for(int i=0;i<n;i++) {
	    	System.out.println(arr[i]+" ");
	     }
	    
	}

 String[] sortStrings(String[] arr) {
		Arrays.sort(arr); 
		String[] sample = arr;
		 
        
        System.out.println(sample.length);
        	if(sample.length%2==0)
        	{for (int i = 0; i < sample.length / 2; i++) {
                sample[i]= sample[i].toUpperCase();
            }
        	}
        	else {
        		for (int i = 0; i <= sample.length / 2; i++) {
        			sample[i] = sample[i].toUpperCase();
                } 
        }
        return sample;
	}
}


