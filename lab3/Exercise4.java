package lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("ENTER AN INTEGER: ");
		int number1 = s.nextInt();
		System.out.println(modifyNumber(number1));
		
	}
	static int modifyNumber(int number1) {
		StringBuffer num= new StringBuffer(Integer.toString(number1));
		System.out.println(num);
		for(int i=0;i<num.length();i++) {
			if(i!=num.length()-1)
			{
				int a=Math.abs(num.charAt(i)-num.charAt(i+1));
				//System.out.println(a);
				char b=(char)(a+'0');
				//System.out.println(b);
				num.setCharAt(i, b);
		
			}
			
		}
		number1=Integer.parseInt(num.toString());
		//System.out.println(bii);
		return number1;
	}

}
