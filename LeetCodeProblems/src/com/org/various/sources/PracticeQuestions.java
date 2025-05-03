package com.org.various.sources;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeQuestions
{
	public static void main(String[] args)
	{
		// 1. Find the sum of all elements in a list using Streams

		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55);

		int sum = list.stream()
				.reduce(0, Integer::sum);
		// OR:
		int dupSum = list.stream()
				.mapToInt(Integer::intValue)
				.sum();

		System.out.println("Sum: " + sum);
		System.out.println("Duplicate Sum: " + dupSum);

		// 2. Find the maximum element from above list

		int max = list.stream()
				.max(Comparator.naturalOrder())
				.get();
		System.out.println("Max element: " + max);

		// 3. Given a list of names, group them by their first letter, and then count the number of names in each group.

		String[] names = {"Alice", "Bob", "Charlie", "Amy", "Bill", "Anna"};

		Map<Character, Long> map = Arrays.stream(names)
				.collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));
		System.out.println("Max element: " + map);

		// 4. Find and print duplicate numbers in an array if it contains multiple duplicates?

		int[] arr = {2, 4, 2, 3, 1, 5, 5, 78, 3, 1, 5};

		Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.map(Entry::getKey)
				.forEach(System.out::println);

		// 5. Given a list of words, filter and print the palindromes

		List<String> strings = List.of("level", "hello", "radar", "world", "deed");

		List<String> palindromes = strings.stream()
				.filter(string -> string.equals(new StringBuilder(string).reverse().toString()))
				.toList();
		System.out.println("Plaindromes found: " + palindromes);

		// 6. How do you merge two sorted arrays into a single sorted array?

		int[] array1 = {1, 3, 32, 5, 7};
		int[] array2 = {2, 4, 6, 62, 8};

		int[] sortedArray = Stream.of(array1, array2)
				.flatMapToInt(Arrays::stream)
				.sorted()
				.toArray();
		System.out.println("Merged sorted array: " + Arrays.toString(sortedArray));

		// 9. Student Grade Classification - 70 and above pass

		List<Student> students = List.of(
				new Student("Alice", 85),
				new Student("Bob", 60),
				new Student("Charlie", 75),
				new Student("David", 90));

		Map<String, List<Student>> studentMap = students.stream()
				.collect(Collectors.groupingBy(student -> student.getMarks() >= 70 ? "Pass" : "Fail"));

		System.out.println(studentMap);

		// 10.Partition a list of numbers into two groups: even and odd, using a custom predicate.

		List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<Boolean, List<Integer>> partitionedNumbers = numbers1.stream()
				.collect(Collectors.partitioningBy(n -> n % 2 == 0));

		System.out.println(partitionedNumbers);
	}

}

class Student
{
	private String name;
	private int marks;

	public Student(String name, int marks)
	{
		this.name = name;
		this.marks = marks;
	}

	public String getName()
	{
		return name;
	}

	public int getMarks()
	{
		return marks;
	}

	@Override
	public String toString()
	{
		return name + "(" + marks + ")";
	}
}
