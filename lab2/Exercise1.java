package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter size of array");
		Scanner myObj = new Scanner(System.in); 
	     n = myObj.nextInt();
	     
	     System.out.println("Enter the array elements");
	     int[] arr = new int[n];
	     for(int i=0;i<n;i++) {
	    	 arr[i]=myObj.nextInt();
	     }
	     Exercise1 a = new Exercise1();
	     
	     System.out.println(a.getSecondSmallest(arr));

	     
	}
	int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}


}

