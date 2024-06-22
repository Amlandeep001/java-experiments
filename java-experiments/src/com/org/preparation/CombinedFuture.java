package com.org.preparation;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CombinedFuture
{
	public static void main(String... a) throws InterruptedException, ExecutionException
	{
		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Beautiful");
		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> "World");

		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);

		// ...

		combinedFuture.get();

		String combined = Stream.of(future1, future2, future3)
				.map(CompletableFuture::join)
				.collect(Collectors.joining(" "));

		System.out.println(combined);
	}

}
