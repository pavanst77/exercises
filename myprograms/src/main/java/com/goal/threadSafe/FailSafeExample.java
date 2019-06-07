package com.goal.threadSafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeExample {

	/**
	 * Fail Safe Iterator makes copy of the internal data structure (object array)
	 * and iterates over the copied data structure.Any structural modification done
	 * to the iterator affects the copied data structure. So , original data
	 * structure remains structurally unchanged .Hence , no
	 * ConcurrentModificationException throws by the fail safe iterator.
	 * 
	 * Two issues associated with Fail Safe Iterator are :
	 * 
	 * 1. Overhead of maintaining the copied data structure i.e memory.
	 * 
	 * 2. Fail safe iterator does not guarantee that the data being read is the data
	 * currently in the original data structure.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ConcurrentHashMap<String, String> cmap = new ConcurrentHashMap<String, String>();

		cmap.put("key1", "A");
		cmap.put("key2", "B");
		cmap.put("key3", "C");

		Iterator<String> itr = cmap.keySet().iterator();

		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + " = " + cmap.get(key));
			cmap.put("key4", "D");
		}
	}
}
