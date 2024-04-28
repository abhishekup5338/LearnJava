package CollectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Hashtable<String,String> m = new Hashtable<String,String>();
		
		m.put("url", "http://localhost:100"); //We have to put the value in KEY,VALUE form.
		m.put("userid", "admin");
		m.put("pwd", "admin");
		m.put("fname", "Abhishek");
		m.put("lname", "Upadhyay");
		
		//We not be put null in "KEY AND VALUE"
		//There is no null concept
		//If we put null this show error in output
		//HASHTABLE is old concept when we use legacy java
		//It does not support NULL concept
		//HASHTABLE is a class
		
		System.out.println(m.get("pwd")); //We can get the value using M.GET method.
		
		for(Entry<String,String> i:m.entrySet())   //We have to pass "ENTRY SET CONCEPT".
		{
			 System.out.println(i.getKey()+"    "+ i.getValue());
		}
		
		
		
		
		
		
		
		
		
	}

}
