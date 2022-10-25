package lab6;


import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

//Exercise 6: Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote. A person is eligible for vote if his age is greater than 18. Add the IDs of all the eligible persons to list and return the list. 

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> voters = new HashMap<>();
		voters.put(1001, 16);
		voters.put(1002, 17);
		voters.put(1003, 21);
		voters.put(1004, 23);
		voters.put(1005, 12);
		voters.put(1006, 19);
		voters.put(1007, 20);
		voters.put(1008, 18);
		System.out.println("Elegible voter id: "+votersList(voters));;

	}
	static List<Integer> votersList(HashMap<Integer, Integer> voters){
		List<Integer> eligibleVoterID = new LinkedList<>();
		Set<Integer> obj = voters.keySet();//since set key is unique and not null it is stored in Set
		for (Integer i : obj) {
			if (voters.get(i)>=18) {
				eligibleVoterID.add(i);
			}
		}
		return eligibleVoterID;
		
	}

}
