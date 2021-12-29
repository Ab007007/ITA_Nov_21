package com.ita.javatraining.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Set set  = new TreeSet();
		set.add("Sharath");
		set.add("Venkat");
		set.add("Aravinda");
		set.add("Puru");
		
		System.out.println("Total Elements in my Set is " + set.size());
		set.add("Sharath");
		set.add("Venkat");
		
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
