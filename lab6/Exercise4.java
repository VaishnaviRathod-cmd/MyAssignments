package lab6;

/*
 * Exercise 4:  school offers medals to the students of tenth based on the following criteria 
If(Marks>=90) : Gold 
If(Marks between 80 and 90) : Silver 
If(Marks between 70 and 80) : Bronze 
Note: Marks between 80 and 90 means marks>=80 and marks<90 

 * */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

class Student {
	int regNo;
	int marks;
	public Student(){}
	public Student(int regNo, int marks) {
		super();
		this.regNo = regNo;
		this.marks = marks;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student(1,71);
		Student std2 = new Student(2,95);
		Student std3 = new Student(4,89);
		Student std4 = new Student(5,76);
		HashMap<Integer, Integer> hs = new HashMap<>();
		hs.put(std1.getRegNo(), std1.getMarks());
		hs.put(std2.getRegNo(), std2.getMarks());
		hs.put(std3.getRegNo(), std3.getMarks());
		hs.put(std4.getRegNo(), std4.getMarks());
		System.out.println(getStudents(hs));
		
		
		
	}
	static HashMap<Integer, String> getStudents(HashMap<Integer, Integer> hs){
		HashMap<Integer, String> prize = new HashMap<>();
		
		
		//Using while loop and iterator
		Iterator<Integer> itr = hs.keySet().iterator();
		while (itr.hasNext()) {
			Integer so = itr.next();
			if (hs.get(so)>=90) {
				prize.put(so, "Gold");
				
			}
			else if (hs.get(so)>=80 && hs.get(so)<90) {
				prize.put(so, "Silver");
			}
			else if (hs.get(so)>=70 && hs.get(so)<80) {
				prize.put(so, "Bronze");
			}
			
		}
		
		return prize;
	}

}