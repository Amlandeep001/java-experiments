package com.org.various.sources;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NewInterviewProblems
{
	public static void main(String[] args)
	{
		// 1:
		String input = "AABBAAC";
		manipulateString(input); // output: A2B2A2C1

		manipulateString2(input); // output: A4B2C1

		// 2:
		List<Integer> list = Arrays.asList(1, 66, 88, 99, 100);
		secondLargestNumber(list);

		// 3:
		String str = "000012345";
		removeZeros(str);

		// 4:
		String newStr = "I love java";
		splitUsingStream(newStr);

		// 5:
		List<Integer> ints = Arrays.asList(44, 66, 88, 99, 100);
		findMaximum(ints);

		// 6:
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		filterEvensThenSquare(numbers);

		// 7:
		List<List<String>> listOfLists = Arrays.asList(
				Arrays.asList("a", "b", "c"),
				Arrays.asList("d", "e", "f"),
				Arrays.asList("g", "h", "i"));
		convertIntoSingleList(listOfLists);

		// 8:
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> list2 = Arrays.asList(5, 6, 7, 8);
		List<Integer> list3 = Arrays.asList(9, 10, 11, 12);
		concatIntoSingleList(list1, list2, list3);

		// 9:
		int[] arr = {1, 2, 3, 2, 1};
		removeDuplicates(arr);

		// 10:
		String[] strArr = {"java ruby struts", "spring java spring", "spring python"};
		String s = "spring";
		countOfString(strArr, s);

		// 11:
		String company = "BNYMELLON";
		findFrequencyOfN(company);

		// 12:
		String word = "programming";
		findRepeatedCharacters(word);
	}

	private static void manipulateString(String input)
	{
		String result = "";
		char currentChar = input.charAt(0);
		int count = 1;

		for(int i = 1; i < input.length(); i++)
		{
			char nextChar = input.charAt(i);

			if(nextChar == currentChar)
			{
				count++;
			}
			else
			{
				result += currentChar + Integer.toString(count);
				currentChar = nextChar;
				count = 1;
			}
		}
		result += currentChar + Integer.toString(count);
		System.out.println(result); // output: A2B2A2C1
	}

	private static void manipulateString2(String input)
	{
		List<String> strings = Arrays.asList(input.split(""));

		String result = strings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.map(entry -> entry.getKey() + entry.getValue())
				.collect(Collectors.joining());
		System.out.println("Result: " + result);
	}

	private static void secondLargestNumber(List<Integer> list)
	{
		int secondLargest = list.stream()
				// .sorted(Comparator.reverseOrder())
				// .sorted((a, b) -> b.compareTo(a))
				.sorted((a, b) -> b - a)
				.skip(1)
				.findFirst()
				.get();
		System.out.println("Second Largest: " + secondLargest); // output : 99
	}

	private static void removeZeros(String str)
	{
		List<String> strings = Arrays.asList(str.split(""));

		Map<Boolean, List<String>> map = strings.stream()
				.collect(Collectors.partitioningBy(s -> s.equals("0")));

		List<String> listWithoutZeros = map.get(false);
		System.out.println(listWithoutZeros.stream().collect(Collectors.joining())); // output : 12345
	}

	private static void splitUsingStream(String newStr)
	{
		Arrays.stream(newStr.split(" ")).forEach(System.out::println); // output: I \n love \n java
	}

	private static void findMaximum(List<Integer> ints)
	{
		int max = ints.stream()
				.max(Integer::compareTo)
				.get();
		System.out.println("Max number: " + max); // output: 100
	}

	private static void filterEvensThenSquare(List<Integer> numbers)
	{
		List<Integer> evensSquared = numbers.stream()
				.filter(num -> num % 2 == 0)
				.map(ele -> ele * ele)
				.toList();

		System.out.println(evensSquared); // output: [4, 16, 36, 64]
	}

	private static void convertIntoSingleList(List<List<String>> listOfLists)
	{
		List<String> strings = listOfLists.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());

		System.out.println(strings); // output: ["a", "b", "c", "d", "e", "f", "g", "h", "i"]
	}

	private static void concatIntoSingleList(List<Integer> list1, List<Integer> list2, List<Integer> list3)
	{
		List<Integer> list = Stream.concat(Stream.concat(list1.stream(), list2.stream()), list3.stream())
				.collect(Collectors.toList());

		System.out.println(list); // output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]

		// OR

		List<Integer> ints = Stream.of(list1, list2, list3)
				.flatMap(List::stream)
				.collect(Collectors.toList());

		System.out.println(ints);
	}

	private static void removeDuplicates(int[] arr)
	{
		/*int[] uniques = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() == 1)
				.map(a -> a.getKey())
				.mapToInt(Integer::intValue)
				.toArray();*/
		int[] uniques = Arrays.stream(arr)
				.distinct()
				.toArray();

		System.out.println("Unique Array: " + Arrays.toString(uniques)); // output: 3
	}

	private static void countOfString(String[] strArr, String s)
	{
		long count = Arrays.stream(strArr)
				.map(x -> x.split(" "))
				.flatMap(x -> Arrays.stream(x))
				.filter(x -> x.equals(s))
				.count();
		System.out.println(count); // output: 3
	}

	private static void findFrequencyOfN(String company)
	{
		long frequencyOfN = company.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getKey() == 'N')
				.map(Map.Entry::getValue)
				.findFirst()
				.orElse(0L);
		System.out.println("Frequency of 'N': " + frequencyOfN); // output : 1
	}

	private static void findRepeatedCharacters(String word)
	{
		/*Character[] repeatedChars = word.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey)
				.toArray(Character[]::new);*/

		List<String> characters = Arrays.asList(word.split(""));

		String[] repeatedChars = characters.stream()
				.filter(c -> Collections.frequency(characters, c) > 1)
				.distinct()
				.toArray(String[]::new);

		System.out.println("Repeated Characters: " + Arrays.toString(repeatedChars)); // output : [r, g, m]
	}
}
