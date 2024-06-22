package com.org.expriments.multithreading;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @implNote: https://www.developer.com/java/concurrenthashmap-java/
 */
public class SampleConcurrentHashMap
{
	public static void main(String[] args)
	{
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

		concurrentHashMap.put("P001", "Lenovo Legion");
		concurrentHashMap.put("P002", "DELL Inspiron");
		concurrentHashMap.put("P003", "Lenovo ThinkPad");

		System.out.println(concurrentHashMap);
	}
}
