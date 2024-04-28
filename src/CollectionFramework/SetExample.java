package CollectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Integer> lst = new LinkedHashSet<Integer>();  
		lst.add(10);
		lst.add(20);
		lst.add(30);
		lst.add(40);
		lst.add(50);
		lst.add(50);
		
		//LIST are supports duplicate value.But SET are not support duplicate value it count only one at a time.
		
		//We could not retrive single value in SET using GET method but using ITERATOR method we can get
		
		//It is printing random order value at the end
		
		//if we want to print the value as it is which we are written. We have to use LINKEDHASHSETN.
		System.out.println(lst.size());
		
		Iterator<Integer> iter = lst.iterator();
		/*
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		System.out.println(iter.next());
		*/
		//ANOTHER WAY 
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("====================");
		
		for(int i:lst)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		

	}

}
