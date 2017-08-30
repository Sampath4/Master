package com.java.ArrayListExample;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractical {

	public static void main(String[] args) {
		// ArrayList Al = new ArrayList();

		// Al.add("1");
		// Al.add("2");
		// Al.add("3");
		// Al.add("6");
		// Al.add("5");
		// Al.add("4");
		// Al.add("7");
		// Al.get(4);
		// Iterator iterator = Al.iterator();
		// while(iterator.hasNext())
		// {
		// System.out.println("The list of Elements in the following array is "
		// + iterator.next());
		// }
		//
		//
		// System.out.println("The size of this Arrai is "+ Al.size());
		// System.out.println("That particular number was " + Al.get(4));
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("3");
		al.add("2");
		al.add("4");
		al.add("5");
		al.add("2");
		al.sort(null);
		al.add(null);
		System.out.println("The size of the current ArraList " + al.size());
		System.out.println("The Present Calling Index Number Was " + al.get(3));
		Iterator iterator = al.iterator();
		while (iterator.hasNext()) {
			{
				System.out.println("The All The Numbers In Current Array List is " + iterator.next());

			}
		}

	}
// 	Changes are done by SAMPATH REDDY
}
