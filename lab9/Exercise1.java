package lab9;

//Exercise 1: Write a lambda expression which accepts x and y numbers and return xy.
//import java.lang.FdLibm.Pow;

public class Exercise1 {

	interface Intf{
		int power(int x, int y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intf a = (x, y) -> (int)Math.pow(x, y); //
		System.out.println(a.power(2, 10));
	}

}