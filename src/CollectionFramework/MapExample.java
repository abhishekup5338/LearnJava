package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> m = new HashMap<String,String>();
		
		m.put("url", "http://localhost:100"); //We have to put the value in KEY,VALUE form.
		m.put("userid", "admin");
		m.put("pwd", "admin");
		m.put("fname", "Abhishek");
		m.put("lname", "Upadhyay");
		m.put(null, "Key is null"); //Key will we null
		m.put("Value is null", null); //Value also be null
		
		
		System.out.println(m.get("pwd")); //We can get the value using M.GET method.
		
		for(Entry<String,String> i:m.entrySet())   //We have to pass "ENTRY SET CONCEPT".
		{
			 System.out.println(i.getKey()+"    "+ i.getValue());
		}
		
		//It support NULL concept
		//It printing the random value in output.
		//To print it properly we have to use "LinkedHashMap"
		//HASHMAP is latest concept
		//HASHMAP is more efficent compare to HASHTABLE
		//HASHMAP is a interface
		
		
		
		
		
		

	}

}
