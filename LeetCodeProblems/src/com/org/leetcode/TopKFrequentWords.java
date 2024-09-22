package com.org.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

//https://leetcode.com/problems/top-k-frequent-words/
public class TopKFrequentWords
{
	public static List<String> topKFrequent(String[] words, int k)
	{
		/*return Arrays.asList(words)
				.stream()
				.collect(Collectors.groupingBy(
						Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.sorted((entry1, entry2) ->
				{
					int freqCompare = Long.compare(entry2.getValue(), entry1.getValue());
					if(freqCompare != 0)
					{
						return freqCompare; // Sort by frequency (descending)
					}
					else
					{
						return entry1.getKey().compareTo(entry2.getKey()); // Sort by lexicographical order
					}
				})
				.limit(k)
				.map(Entry::getKey)
				.toList();*/

		// Step 1: Create a frequency map to count occurrences of each word
		Map<String, Integer> frequencyMap = new HashMap<>();
		for(String word : words)
		{
			frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
		}

		// Step 2: Create a priority queue (min-heap) with a custom comparator
		PriorityQueue<String> heap = new PriorityQueue<>((word1, word2) ->
		{
			int freqCompare = frequencyMap.get(word1).compareTo(frequencyMap.get(word2));
			if(freqCompare != 0)
			{
				return freqCompare; // Sort by frequency (ascending for min-heap)
			}
			else
			{
				return word2.compareTo(word1); // Sort lexicographically (descending)
			}
		});

		// Step 3: Add words to the heap and maintain the size to k
		for(String word : frequencyMap.keySet())
		{
			heap.offer(word);
			if(heap.size() > k)
			{
				heap.poll(); // Remove the smallest element to maintain top k
			}
		}

		// Step 4: Extract elements from the heap and reverse them to get the result in correct order
		List<String> result = new ArrayList<>();
		while (!heap.isEmpty())
		{
			result.add(heap.poll());
		}
		Collections.reverse(result); // Since we used a min-heap, we need to reverse the order

		return result;
	}

	public static void main(String[] args)
	{
		String[] words = {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		System.out.println(topKFrequent(words, 4));
	}
}
