package com.org.preparation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//https://www.hackerrank.com/challenges/java-sort/problem?isFullScreen=true
public class Sorting
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0)
		{
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}

		in.close();

		List<Student> students = studentList.stream()
				.sorted(Comparator.comparingDouble(Student::getCgpa).reversed()
						.thenComparing(Student::getFname)
						.thenComparingInt(Student::getId))
				.collect(Collectors.toList());

		for(Student st : students)
		{
			System.out.println(st.getFname());
		}
	}
}

class Student
{
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa)
	{
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId()
	{
		return id;
	}

	public String getFname()
	{
		return fname;
	}

	public double getCgpa()
	{
		return cgpa;
	}
}
