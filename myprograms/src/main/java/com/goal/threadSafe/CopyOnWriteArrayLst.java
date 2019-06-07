package com.goal.threadSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * CopyOnWriteArrayList: CopyOnWriteArrayList class is introduced in JDK 1.5,
 * which implements List interface. It is enhanced version of ArrayList in which
 * all modifications (add, set, remove, etc) are implemented by making a fresh
 * copy.
 * 
 * @author KH1760
 *
 */
public class CopyOnWriteArrayLst extends Thread {

	static CopyOnWriteArrayList<String> cal = new CopyOnWriteArrayList<String>();

	public void run() {
		cal.add("D");
	}

	public static void main(String[] args) throws InterruptedException {
		cal.add("A");
		cal.add("B");
		cal.add("C");
		CopyOnWriteArrayLst t = new CopyOnWriteArrayLst();
		t.run();
		Thread.sleep(1000);

		Iterator<String> itr = cal.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
			cal.add("E");
		}

	}
}
