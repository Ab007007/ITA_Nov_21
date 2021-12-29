package com.ita.javatraining.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {

		Map mp = new HashMap();

		mp.put("name", "Aravinda");
		mp.put("age", 36);
		mp.put("height", 5.8);
		mp.put("locaiton", "Bangalore");

		Set keys = mp.keySet();
		
		Iterator it = keys.iterator();
		String key = null;
		while(it.hasNext())
		{
			//System.out.println(mp.get(it.next()));
			key = (String) it.next();
			System.out.println(mp.get(key));
		
		}

	}
}
