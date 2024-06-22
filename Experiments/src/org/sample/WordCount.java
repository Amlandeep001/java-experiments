package org.sample;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount
{

	public static void main(String[] args)
	{
		List<String> names = List.of("Ram", "Sam", "Jadu", "Madhu", "Ram", "Sam", "Ram", "Jadu");

		Map<String, Long> mapOutput = names.stream()
				// .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.collect(Collectors.groupingBy(w -> w, Collectors.counting()));

		mapOutput.forEach((k, v) ->
		{
			if(v > 1)
			{
				System.out.println(k + "-" + v);
			}
		});

		String string = "The best of both worlds";

		int count = 0;

		/*String[] words = string.split(" ");
		
		for(int i=0; i<words.length ; i++) {
			count += words[i].length();
		}
		
		System.out.println("Characaters count : " + count);*/

		for(int i = 0; i < string.length(); i++)
		{
			if(string.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println("Characaters count : " + count);
	}
}
