package com.org.codingninjas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FirstNonRepeatingCharacter
{

	public static char firstNonRepeatingCharacter(String str)
	{
		// Write your code here

		List<String> sl = Arrays.asList(str.split(""));

		Optional<String> optChar = sl.stream()
				.filter(e -> Collections.frequency(sl, e) == 1)
				.findFirst();

		if(optChar.isPresent())
		{
			return optChar.get().toCharArray()[0];
		}

		return str.toCharArray()[0];
	}

}
