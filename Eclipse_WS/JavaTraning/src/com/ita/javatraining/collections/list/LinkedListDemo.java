package com.ita.javatraining.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	
	public static void main(String[] args) {
		
		List l = new LinkedList();
		l.add(50);
		l.add("Aravinda");
		l.add(55.5);
		l.add(true);
		l.add('M');
		
		
		printElements(l);
		l.add(0, "new element");
		printElements(l);
		l.remove(0);
		printElements(l);
	}

	private static void printElements(List l) {
		System.out.println("Total number of elements in the collections " + l.size());
		
		for(int i=0; i<l.size();i++) {
			System.out.println("Element at index " + i + " is " + l.get(i));
		}
	}
}
