package org.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Mapp {
	public static void main(String[] args) {
		Map<Integer, String> mp=new LinkedHashMap<Integer,String>();
		
		mp.put(10, "java");
		mp.put(20, "selenium");
		mp.put(30, "sql");
		mp.put(40, "sql");
		mp.put(10, "manual");
		
		System.out.println(mp);
		
		int size = mp.size();
		System.out.println(size);
		
		String i = mp.get(10);
		System.out.println(i);
		
		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);
		
		Collection<String> values = mp.values();
		System.out.println(values);
		
		String remove = mp.remove(40);
		System.out.println(mp);
		
		boolean containsKey = mp.containsKey(30);
		System.out.println(containsKey);
		
		boolean containsValue = mp.containsValue("sql");
		System.out.println(containsValue);
		
		boolean empty = mp.isEmpty();
		System.out.println(empty);
		
		mp.clear();
		System.out.println(mp);
		
		
		
		
	}

}
