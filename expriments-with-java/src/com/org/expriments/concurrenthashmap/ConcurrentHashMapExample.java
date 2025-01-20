package com.org.expriments.concurrenthashmap;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @implNote : ConcurrentHashMap returns a fail safe iterator. It means, using this iterator, we can modify ConcurrentHashMap while iterating it.
 * Link: https://javatrainingschool.com/concurrenthashmap-in-java/
 * @author Amlan
 * @param args
 */

public class ConcurrentHashMapExample
{
	public static void main(String[] args)
	{
		ConcurrentHashMap<Integer, String> cMap = new ConcurrentHashMap<>();
		cMap.put(1, "Taj Mahal");
		cMap.put(2, "Qutab Minar");
		cMap.put(3, "Char Minar");

		Iterator<Integer> it = cMap.keySet().iterator();
		while (it.hasNext())
		{
			int key = it.next();
			if(key == 2)
			{
				cMap.put(4, "Gateway of India"); // In normal HashMap it would have broken here throwing ConcurrentModficationException
			}
			System.out.println(key + " : " + cMap.get(key));
		}
	}
}
