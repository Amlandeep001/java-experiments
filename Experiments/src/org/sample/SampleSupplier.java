package org.sample;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SampleSupplier
{

	public static void main(String[] args)
	{
		Supplier<LocalDate> currentDate = () -> LocalDate.now();
		System.out.println("Current date: " + currentDate.get());

		String s = "code decode";
		Set<String> set = new HashSet<>();
		List<String> bs = List.of(s.split(""));

		Set<String> dupChars = bs.stream()
				.filter(a -> !a.isBlank() && !set.add(a))
				.collect(Collectors.toSet());

		System.out.println(dupChars);

		List<Integer> intList = List.of(1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 8, 9);
		Set<Integer> intSet = new HashSet<>();

		Set<Integer> duplicateSet = intList.stream()
				.filter(x -> !intSet.add(x))
				.collect(Collectors.toSet());

		System.out.println("Count of dup integers: " + duplicateSet.size());
	}

}
