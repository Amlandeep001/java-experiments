package com.org.expriments.concurrenthashmap;

//Java program to handle duplicate keys in a TreeMap
import java.util.TreeMap;
class SampleTreeMap {
  public static void main(String[] args) {
     // Creating a TreeMap
     TreeMap<Integer, String> treeMap = new TreeMap<>();

     // Adding key-value pairs
     treeMap.put(1, "One");
     treeMap.put(2, "Two");
     treeMap.put(3, "Three");

    // Attempting to add a duplicate key
     treeMap.put(2, "New Two"); // This will overwrite the value for key 2


     // Displaying the contents of the TreeMap
     System.out.println("TreeMap contents: " + treeMap);
 }
}