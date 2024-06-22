package com.org.expriments.functionalinterface.consumer;

@FunctionalInterface
interface MultiArgConsumer<T, U, V, W>
{
	void accept(T t, U u, V v, W w);
}
