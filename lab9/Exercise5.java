package lab9;

import java.util.Scanner;

//Write a method to calculate factorial of a number. Test this method using method reference feature. 

public class Exercise5 {
	interface interfacefact{
		int fact(int x);
	}
   public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a num");
		int x = scanner.nextInt();
		
		
		interfacefact f1 = (a) -> {
			
			if (a<2) {
				return 1;
			}
			else
			{ int fact=1;int i;
				 for(i=1;i<=a;i++){    
				      fact=fact*i;    
				  }   
				 return fact;
			}
		};
		System.out.println(f1.fact(x));
		scanner.close();
   }
}
