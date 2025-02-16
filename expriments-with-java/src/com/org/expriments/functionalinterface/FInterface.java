package com.org.expriments.functionalinterface;

/**
 * Functional Interface with a single abstract method. Annotation will make sure to check whether it's having 
 * only one abstract method during compile time.
 * @author Amlan
 */
@FunctionalInterface
public interface FInterface
{
	int multiply(int a, int b);
}
