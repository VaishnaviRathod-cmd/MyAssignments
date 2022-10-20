package lab3;

import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a line of numbers: ");
		String input = s.next();
		StringBuffer sb = new StringBuffer(input);
        System.out.println(getImage(sb));
	}
	static StringBuffer getImage(StringBuffer sb) {
       
        StringBuffer x = new StringBuffer(sb);
        sb.reverse();
        x.append("|"+sb);
		return x;
	}
}
