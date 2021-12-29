package com.ita.javatraining.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		Set set  = new HashSet();
		set.add(100);
		set.add("ABC");
		set.add(33.5);
		
		System.out.println("Total Elements in my Set is " + set.size());
		set.add(1000);
		set.add("ABC");
		set.add(333.5);
		
		System.out.println("Total Elements in my Set is " + set.size());

	
	
//		set.remove("ABC");
//		
//		System.out.println("Total Elements in my Set is " + set.size());
//		
		Iterator it  = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
	
	}

}
