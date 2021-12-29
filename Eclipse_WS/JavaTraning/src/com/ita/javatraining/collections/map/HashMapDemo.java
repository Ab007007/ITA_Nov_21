package com.ita.javatraining.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map mp = new HashMap();

		mp.put("name", "Aravinda");
		mp.put("age", 36);
		mp.put("locaiton", "Bangalore");

		System.out.println("Size of Map is " + mp.size());

		mp.remove("age");

		System.out.println("Size of Map after element removed " + mp.size());
		System.out.println("Name " + mp.get("name"));

		if (mp.containsKey("name")) {
			System.out.println("Key is already present");
			mp.put("surname", "HB");
		} else {
			mp.put("name", "NEWAravinda");
		}
		System.out.println("Name " + mp.get("name"));

		System.out.println("Size of Map after adding surname  " + mp.size());

	}
}
