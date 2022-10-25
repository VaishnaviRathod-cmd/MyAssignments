package lab6;


import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,33,5,6,8,53};
		System.out.println(getSquare(arr));
		

	}
	static Map<Integer, Integer> getSquare(int[] arr) {
		Map<Integer, Integer> intMap = new HashMap<>();
		for(int i = 0; i<arr.length; i++) {
			intMap.put(arr[i], arr[i]*arr[i]);
			
		}
		return intMap;
	}

}
