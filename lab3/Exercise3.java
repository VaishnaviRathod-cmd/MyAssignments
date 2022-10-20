package lab3;

import java.util.Scanner;

public class Exercise3 {
public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER A STRING: ");
		String input = s.next();
		StringBuffer sb = new StringBuffer(input);
        System.out.println(alterString(sb));
	}
static String alterString(StringBuffer sb) {
	String ans="/";
    for(int i=0;i<sb.length();i++) {
    	if(sb.charAt(i)!='A'&&sb.charAt(i)!='E'&&sb.charAt(i)!='I'&&sb.charAt(i)!='O'&&sb.charAt(i)!='U'
    			&&sb.charAt(i)!='a'&&sb.charAt(i)!='e'&&sb.charAt(i)!='i'&&sb.charAt(i)!='o'&&sb.charAt(i)!='u'
        			
    			) {
    		int asciiX = (int) sb.charAt(i);
    		char x=(char)(asciiX+1);
    		sb.replace(i,i+1,Character.toString(x));
    		ans=sb.toString();
    	}
    	
    }
    
	return ans;
}
}
