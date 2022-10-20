package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter size of array");
		Scanner myObj = new Scanner(System.in); 
	     size = myObj.nextInt();
	     
	     System.out.println("Enter the array elements");
	     int[] arr = new int[size];
	     for(int i=0;i<size;i++) {
	    	 arr[i]=myObj.nextInt();
	     }
	     Exercise4 d = new Exercise4();
	     Arrays.sort(arr);
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
		 
        d.removeDuplicates(arr, size);
	}
    
	void removeDuplicates(int arr[], int n)
    {
        int size=n;
     // Not entering, if array is empty or contains a single
        if (n != 0 && n != 1)
        {
 
        	int j = 0;
            
            for (int i = 0; i < n-1; i++)
                if (arr[i] != arr[i+1])
                    arr[j++] = arr[i];
          
            arr[j++] = arr[n-1];
          
           
        size=j;
        }
        System.out.println();
        for (int i = size-1;i>=0 ;i--)
            System.out.print(arr[i] + " ");
    }
}
