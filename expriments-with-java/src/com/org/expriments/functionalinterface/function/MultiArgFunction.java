package com.org.expriments.functionalinterface.function;

@FunctionalInterface
interface MultiArgFunction<T, U, V, R>
{
	R apply(T t, U u, V v);
}
