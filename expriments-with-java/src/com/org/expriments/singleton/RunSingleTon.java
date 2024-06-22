package com.org.expriments.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class RunSingleTon
{

	public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, FileNotFoundException, IOException, CloneNotSupportedException
	{
		SingleTon originalSingleTon = SingleTon.getInstance();
		SingleTon duplicateSingleton = SingleTon.getInstance();

		System.out.println("Hash Code of original instance : " + originalSingleTon.hashCode());
		System.out.println("Hash Code of duplicate instance : " + duplicateSingleton.hashCode());

		originalSingleTon.getMethod();
		duplicateSingleton.getMethod();

		EagerSingleTon originalEagerSingleTon = EagerSingleTon.getInstance();
		EagerSingleTon duplicateEagerSingleton = EagerSingleTon.getInstance();

		System.out.println("Hash Code of original Eager instance : " + originalEagerSingleTon.hashCode());
		System.out.println("Hash Code of duplicate Eager instance : " + duplicateEagerSingleton.hashCode());

		// Breaking with Reflection

		Class<?> singleTonClass = Class.forName("com.org.expriments.singleton.SingleTon");
		@SuppressWarnings("unchecked")
		Constructor<SingleTon> constructor = (Constructor<SingleTon>) singleTonClass.getDeclaredConstructor();
		constructor.setAccessible(true);

		SingleTon brokenSingleTonUsingRelection = constructor.newInstance();

		System.out.println("Hash Code of originalSingleTon instance : " + originalSingleTon.hashCode());
		System.out.println("Hash Code of brokenSIngleTonUsingRelection instance : " + brokenSingleTonUsingRelection.hashCode());

		// Breaking with Serialization

		System.out.println("...........................................................................................................");
		System.out.println("Breaking with Serialization");

		// Serialization process

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Serialization\\Serialization.ser"));
		objectOutputStream.writeObject(originalSingleTon);
		objectOutputStream.close();

		// Deserialization process

		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Serialization\\Serialization.ser"));
		SingleTon brokenSingleTonUsingSerialization = (SingleTon) objectInputStream.readObject();
		objectInputStream.close();

		System.out.println("Hash Code of originalSingleTon instance : " + originalSingleTon.hashCode());
		System.out.println("Hash Code of brokenSingleTonUsingSerialization instance : " + brokenSingleTonUsingSerialization.hashCode());

		// Breaking with Cloning

		System.out.println("...........................................................................................................");
		System.out.println("Breaking with cloning");

		SingleTon brokenSingleTonUsingCloning = (SingleTon) originalSingleTon.clone();

		System.out.println("Hash Code of originalSingleTon instance : " + originalSingleTon.hashCode());
		System.out.println("Hash Code of brokenSingleTonUsingCloning instance : " + brokenSingleTonUsingCloning.hashCode());
	}
}
