package com.org.various.sources;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test2
{
	public static void main(String[] args)
	{
		/*print();
		}
		
		static void print()
		{
		if(true)
			return;
		System.out.println("hello");
		}*/

		/*int x = 5;
		int y = 10;
		
		first:
		{
			second:
			{
				third:
				{
					if(x == y >> 1)
					{
						break second;
					}
				}
				System.out.println(x);
			}
			System.out.println(y);
		}
		}*/

		// System.out.println(LocalDate.now());

		String message = "Employee 12345 worked 10.00 hours, for the date: 2024-02-28";

		String[] parts = message.split(" ");

		String employeeId = parts[1];
		double totalHours = Double.parseDouble(parts[3]);
		// String date = parts[parts.length - 1];
		LocalDate date = LocalDate.parse(parts[parts.length - 1], DateTimeFormatter.ISO_DATE);

		// Output the extracted information
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Total Hours: " + totalHours);
		System.out.println("Date: " + date);

		System.out.println("-----------------------------------------------------------------");

		List<String> items = Arrays.asList("apple", "apple", "banana",
				"apple", "orange", "banana", "papaya");

		Map<String, Long> itemsMap = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Long> sortedMap = itemsMap.entrySet().stream()
				// .sorted((a, b) -> a.getKey().compareTo(b.getKey()))
				// .sorted(Entry.comparingByKey())
				.sorted(Comparator.comparing(Map.Entry::getKey))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(sortedMap);

		System.out.println("-----------------------------------------------------------------");

		Instant currentUTC = Instant.now();
		Instant currentUTCWithoutMS = Instant.now().truncatedTo(ChronoUnit.SECONDS);

		System.out.println("Current UTC Time: " + currentUTC);
		System.out.println("Current UTC Time without miliseconds: " + currentUTCWithoutMS);

		LocalDateTime estTime = LocalDateTime.now(ZoneId.of("America/New_York"));
		LocalDateTime estTimeWithoutMS = LocalDateTime.now(ZoneId.of("America/New_York")).truncatedTo(ChronoUnit.SECONDS);

		System.out.println("Current EST Time: " + estTime);
		System.out.println("Current EST Time without miliseconds: " + estTimeWithoutMS);
	}
}
