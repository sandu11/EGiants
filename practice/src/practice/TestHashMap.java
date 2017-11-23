package practice;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> PhoneNo= new HashMap<>();
		
		PhoneNo.put("US", "+01");
		PhoneNo.put("UK", "+44");
		PhoneNo.put("India", "+91");
		
		HashMap<String, String> PhoneNo2= new HashMap<>();
		
		PhoneNo2.put("Can", "+01");
		PhoneNo2.put("Aus", "+06");
		
		//System.out.println(PhoneNo.get("India"));
		
		PhoneNo.putAll(PhoneNo2);		//Used to join the table2 elements in the table 1
		
		Set<Entry<String, String>> entries =PhoneNo.entrySet();	//used to store in (k,v) format 

		for (Entry<String, String> entry : entries) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
			
		}
		
		
	}

}
