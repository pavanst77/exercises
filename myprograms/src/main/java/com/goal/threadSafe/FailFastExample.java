package com.goal.threadSafe;

import java.util.HashMap;
import java.util.Iterator;

public class FailFastExample {

	/**
	 * Fail fast iterator while iterating through the collection , instantly throws
	 * Concurrent Modification Exception if there is structural modification of the
	 * collection
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key1", "A");
		map.put("key2", "B");
		map.put("key3", "C");
		
		Iterator<String> itr = map.keySet().iterator();
		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println( key+" = "+ map.get(key));
			map.put("key4", "D");
		}
		
	}
}
