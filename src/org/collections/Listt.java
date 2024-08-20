package org.collections;

import java.util.ArrayList;
import java.util.List;

public class Listt {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList();

		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(10);

		System.out.println(li);

		int size = li.size();
		System.out.println(size);

		boolean b = li.add(100);
		System.out.println(li);

		li.add(2, 200);
		System.out.println(li);

		Integer set = li.set(2, 300);
		System.out.println(li);

		li.remove(2);
		System.out.println(li);

		int i = li.indexOf(10);
		System.out.println(i);

		int lio = li.lastIndexOf(10);
		System.out.println(lio);

		boolean contains = li.contains(100);
		System.out.println(contains);

		boolean empty = li.isEmpty();
		System.out.println(empty);

		List<Integer>l=new ArrayList<Integer>();
		System.out.println(l);
		
		boolean all = l.addAll(li);
		System.out.println(l);
		
		l.retainAll(li);
		System.out.println(l);

		l.removeAll(li);
		System.out.println(l);

		
	}

}
