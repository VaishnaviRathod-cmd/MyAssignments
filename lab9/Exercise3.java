package lab9;


import java.util.Scanner;

public class Exercise3 {
//Exercise 3: Write a method that uses lambda expression to accept username and password 
//and return true or false. (Hint: Use any custom values for username and password for authentication)
	
	interface interfacelogin{
		boolean login(String user, String password);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfacelogin authentication = (user, password) -> {
			if (user.equals("vairatho") && password.equals("7890")) {
				return true;
			}
			return false;
		};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the user name");
		String str1 = scanner.nextLine();
		System.out.println("Enter the Password");
		String str2 = scanner.nextLine();
		if (authentication.login(str1, str2)) {
			System.out.println("Login sucessful");
		}
		else {
			System.out.println("Login failed try again");
		}
	}

}
