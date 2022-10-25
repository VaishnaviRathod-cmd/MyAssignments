package lab6;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise2 {

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string");
		str = scanner.nextLine();
		char[] arr = str.toCharArray();
		System.out.println(arr);

		System.out.println(countChars(arr));
		
	}
	static Map<Character, Integer> countChars(char[] arr){
		int len = arr.length;
		Map<Character, Integer> countOfChar = new HashMap<>();
		for(int i=0; i<len; i++) {
			if (countOfChar.containsKey(arr[i])) {
				int count=countOfChar.get(arr[i]);
				countOfChar.put(arr[i], ++count);
			}
			else {
				countOfChar.put(arr[i], 1);
			}
		}
		return countOfChar;
	}
}