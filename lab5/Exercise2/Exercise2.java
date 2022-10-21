package lab5.Exercise2;

import java.util.Scanner;
/*
 * Write a Java Program to validate the full name of an employee.
 *  Create and throw a 
 * user defined exception if firstName and lastName is blank.
 */
public class Exercise2{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First name and Last name --->");
		String first = sc.next();
		String last = sc.next();
		System.out.println("First Name"+ first + "\n");
		System.out.println("First Name"+ last  + "\n");
		try {
			if(first==null || last==null)
			{
				throw new InvalidInputException2("Exception");
			}
			System.out.println("Fullname is= "+first+" "+last);
		}
		catch(InvalidInputException2 e)
		{
			System.out.println("Plz enter the name correctly");
		}
	}

	}
