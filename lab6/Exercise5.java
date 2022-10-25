package lab6;

//Exercise 5: Create a method which accepts an array of integer elements and 
//return the second smallest element in the array
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 6,2,4,1,5};
		System.out.println("Second smalest element: "+getSecondSmallest(arr));

	}
	static int getSecondSmallest(int[] arr) {
		List<Integer> list = new ArrayList<>();
		for (int i : arr) {
			list.add(i);
		}
		Collections.sort(list);
		return list.get(1);
	}

}
