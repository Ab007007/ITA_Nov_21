package com.ita.javatraining.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintCollections {

	
	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add(50);
		l.add("Aravinda");
		l.add(55.5);
		l.add(true);
		l.add('M');
		
		
		printUsingForEachLoop(l);
		
		
		//printUsingIterator(l);
		
		
		//printElements(l);
	
	}

	private static void printUsingForEachLoop(List l) {
		for (Object al : l) {
			System.out.println(al);
		}
	}

	private static void printUsingIterator(List l) {
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	private static void printElements(List l) {
		System.out.println("Total number of elements in the collections " + l.size());
		
		for(int i=0; i<l.size();i++) {
			System.out.println("Element at index " + i + " is " + l.get(i));
		}
	}
	
	
	
}
