package com.java.MapExample;

import java.util.HashMap;
import java.util.Iterator;

public class MapExamples {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "GANGA REDDY");
		map.put(2, "NIRMALA REDDY");
		map.put(3, "RAJI REDDY");
		map.put(4, "SAMPATH REDDY");
		map.put(null, "nullvalue");
		map.put(4, "SANDEEP REDDY");
		Iterator iterator = map.entrySet().iterator();
		System.out.println("the size of the map :" + map.size());
		while (iterator.hasNext()) {
			System.out.println("The list of the map : " + iterator.next());
		}
	}

}
