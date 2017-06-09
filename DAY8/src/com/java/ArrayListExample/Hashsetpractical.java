package com.java.ArrayListExample;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetpractical {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(3);
		hs.add(2);
		hs.add("SAMPATH");
		hs.add(null);
		hs.add(3);
		hs.add(null);
		hs.add("SAMPATH");
		System.out.println("The list in the table " + hs.size());
		Iterator iterator = hs.iterator();
		while (iterator.hasNext()) {
			System.out.println("The size of this table was: " + iterator.next());
		}
	}

}
 