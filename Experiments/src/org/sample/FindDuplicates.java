package org.sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicates
{

	public static void main(String args[])
	{
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		myList.stream()
				.filter(a -> Collections.frequency(myList, a) > 1)
				.distinct()
				.forEach(System.out::println);

		// ----Or---//

		/*Set<Integer> set = new HashSet<Integer>();
		
		myList.stream()
		.filter(a -> !set.add(a))
		.forEach(System.out::println);*/

		String str = Stream.of("lions", "tigers", "bears")
				.collect(Collectors.joining("-"));
		System.out.println(str);
	}
}
