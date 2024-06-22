package com.org.expriments.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestAllFunctionalInterfaces
{
	public static void main(String[] args)
	{
		Function<String, Integer> f = (x) -> x.length();
		System.out.println(f.apply("hello"));

		BiFunction<Integer, Integer, Integer> bf = (n1, n2) -> n1 + n2;
		System.out.println(bf.apply(10, 20));

		Predicate<String> p = (s) -> s.startsWith("Foo");
		System.out.println(p.test("Foobar"));

		BiPredicate<Integer, String> bp = (s1, s2) -> s1 > 20 && s2.startsWith("Flow");
		System.out.println(bp.test(25, "Flower"));

		Supplier<String> su = () -> "hello";
		System.out.println(su.get());

		BooleanSupplier bs = () -> 10 > 20;
		System.out.println(bs.getAsBoolean());

		BinaryOperator<String> bo = (x1, x2) -> x1 + x2;
		System.out.println(bo.apply("Hello", " World"));

		Consumer<String> c = (x) -> System.out.println(x.toLowerCase()); // lambda expression
		c.accept("Raja");

		BiConsumer<String, Integer> biCon2 = (name, age) -> System.out.println(name + " " + age);
		biCon2.accept("Peter", 28);
	}
}
