package lab5.Exercise3;
import java.util.Scanner;
public class Exercise3 {
	
/*
 * Create an Exception class named as
 *  “EmployeeException”(User defined Exception)
 *  in a package named as “com.cg.eis.exception” 
 *  and throw an exception if salary of an employee 
 *  is below than 3000. Use Exception Handling mechanism 
 *  to handle exception properly
 */
		
		public static void main(String[] args) {
			
			System.out.println("Enter the salary of employee");		
			Scanner sc = new Scanner(System.in);
			
			int salary = sc.nextInt();
			try {
				if(salary<3000)
				{
					throw new EmployeeException("Exception");
				}
				System.out.println("The salary is = "+salary);
			}
			catch(EmployeeException e)
			{
				System.out.println("Caught exception - Salary is below 3000");
			}
		
	}
}
