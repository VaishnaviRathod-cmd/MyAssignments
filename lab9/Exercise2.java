package lab9;


import java.awt.color.ColorSpace;
import java.util.Scanner;


import javax.lang.model.element.NestingKind;

//Exercise 2: Write a method that uses lambda expression to format a given string, 
//where a space is inserted between each character of string.  For ex., if input is �CG�,
//then expected output is �C G�.

public class Exercise2 {
	
	interface infstr{
		StringBuilder space(String str);
	}

	public static void main(String[] args) {
	
     Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
	
		String string=	sc.nextLine();
		StringBuilder result = new StringBuilder();
		//lamda expression
		infstr str1 = (String) -> {
			
			for (int i=0;i<string.length();i++) {
				if (i>0) {
					result.append(" ");
				}
				result.append(string.charAt(i));
			}
			return result;
		};
		System.out.println(str1.space(string));

	}

}