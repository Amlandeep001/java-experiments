package org.sample;

import java.util.Optional;

public class SampleOptional
{

	public static void main(String args[])
	{
		Optional<String> opsLife = Optional.of("Blank");

		if(opsLife.isPresent())
		{
			String life = opsLife.get();
			System.out.println(life);
		}
		System.out.println(opsLife.orElse(null));
		System.out.println(opsLife.orElseGet(() -> null));
		System.out.println("-----------------------------");
		System.out.println(opsLife.orElseThrow(() -> new IllegalArgumentException("Not found")));
		System.out.println(Optional.ofNullable(null).get());
	}

}
