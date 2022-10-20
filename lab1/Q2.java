package lab1;

import java.util.Scanner;


public class Q2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VaishnaviRathod e=new VaishnaviRathod();
		Q2 b = new Q2();
		b.Message();
	}
		
void Message() {
	
	 Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	 System.out.println("select one of the three lights: red,yellow,green");
	 String x= myObj.nextLine(); 
	
	
	switch(x) {
	case "red":
		System.out.println("stop");
		break;
	case "yellow":
		System.out.println("ready");
		break;
	case "green":
		System.out.println("go");
		break;	
	}
}
}