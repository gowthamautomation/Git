package org.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Sett {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(10);

		System.out.println(s);
		
		int size = s.size();
		System.out.println(size);
		
	 boolean remove = s.remove(20);
		System.out.println(s);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		boolean contains = s.contains(30);
		System.out.println(contains);
		
		s.clear();
		System.out.println(s);
		
		
		
	}

}
