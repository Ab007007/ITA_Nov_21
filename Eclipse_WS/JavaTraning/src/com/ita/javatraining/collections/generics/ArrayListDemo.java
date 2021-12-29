package com.ita.javatraining.collections.generics;

import java.util.ArrayList;
import java.util.List;

import com.ita.javatraining.variables.Person;

public class ArrayListDemo {

	public static void main(String[] args) {

		Person p1 = new Person();  
		Person p2 = new Person();  
		Person p3 = new Person();  
		Person p4 = new Person();  
		Person p5 = new Person();  
		List<Person> al = new ArrayList<Person>();
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		//al.add(222);
	}

	private static void printElements(List l) {
		System.out.println("Total number of elements in the collections " + l.size());

		for (int i = 0; i < l.size(); i++) {
			System.out.println("Element at index " + i + " is " + l.get(i));
		}
	}
}
