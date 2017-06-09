package com.java.ArrayListExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(1);
		lhs.add(3);
		lhs.add(2);
		lhs.add("SAMPATH");
		lhs.add(null);
		lhs.add(3);
		lhs.add(null);
		lhs.add("SAMPATH");
		lhs.stream();
	
		
		System.out.println("The list in the table " + lhs.size());
		Iterator iterator = lhs.iterator();
		while (iterator.hasNext()) {
			System.out.println("The size of this table was: " + iterator.next());
		}
	}

	}


