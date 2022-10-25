package lab6;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> marks = new LinkedHashMap<>();
		/* Scanner in = new Scanner(System.in);

	        for (int i = 0; i < 3; i++) {
	           String a = in.next();
	           Integer b = in.nextInt();

	            marks.put(a, b);
	        }*/ //hashmap using user input
		//Inserting marks 
		marks.put("cute", 8);
		marks.put("k", 9);
		marks.put("Aa", 6);
		marks.put("F", 0); 
		marks.put("C", 6);
		marks.put("yE", 9);
		System.out.println(getValues(marks));

	}
	static List<Integer> getValues(Map<String, Integer> marks){
		List<Integer> list = new ArrayList<>(marks.values());
		

		Collections.sort(list);  //sorting
		return list;
	}

}