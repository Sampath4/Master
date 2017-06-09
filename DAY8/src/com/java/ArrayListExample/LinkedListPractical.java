package com.java.ArrayListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListPractical {

	public static void main(String[] args) {
		LinkedList Ll = new LinkedList();
		Ll.add("SAMPATH");
		Ll.add("RAJU");
		Ll.add("MOM");
		Ll.add("DAD");
		Ll.add("BMR");
		Ll.add("BGR");
		Ll.add("BGR");
		Ll.addFirst("MOM");
		Ll.removeLast();
		Ll.remove(3);
		Ll.sort(null);
		Ll.add(3, "LOVE");
		Ll.add(null);
		Ll.add(null);

		System.out.println("The list of the linked list is " + Ll.size());
		Iterator iteratot = Ll.iterator();
		while (iteratot.hasNext()) {
			System.out.println("The list of the all the elements in the Linked List is " + iteratot.next());
		}
	}

}
