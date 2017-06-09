package Maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(1, "sampath");
		ht.put(5, "ganga");
		ht.put(3, "baraji");
		ht.put(2, "raj");
		ht.put(4, "niru");
		ht.get(5);
	Iterator iterator = ht.entrySet().iterator();
	while(iterator.hasNext()){
		System.out.println("The list in the table " + iterator.next());

	}
	}

}
