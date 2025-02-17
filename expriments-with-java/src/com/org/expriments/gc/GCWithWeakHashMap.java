package com.org.expriments.gc;

import java.util.Map;
import java.util.WeakHashMap;

public class GCWithWeakHashMap
{
	public static void main(String[] args)
	{
		Map<Person, String> weakMap = new WeakHashMap<>();
		Person key = new Person("Alice");

		weakMap.put(key, "Temporary Data");
		System.out.println("Before GC: " + weakMap);

		key = null;
		System.gc();
		System.out.println("After GC: " + weakMap);
	}
}

record Person(String name)
{
}
