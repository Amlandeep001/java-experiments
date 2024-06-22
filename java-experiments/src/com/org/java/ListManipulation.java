package com.org.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListManipulation {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1, 500));
		empList.add(new Employee(2, 1000));
		empList.add(new Employee(3, 1500));
		empList.add(new Employee(4, 2000));
		empList.add(new Employee(5, 2500));
		empList.add(new Employee(6, 3000));
		empList.add(new Employee(7, 3500));

		// sort employees based on their salaries in descending order

		List<Employee> sortedList = empList.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.collect(Collectors.toList());

		System.out.println(sortedList);

		// fetch top 3 salaried employee details

		List<Employee> top3SalariedEmployees = empList.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.limit(3)
				.collect(Collectors.toList());

		System.out.println(top3SalariedEmployees);

		// fetch all employees having salary less than 3rd highest salary

		List<Employee> bootom4SalariedEmployees = empList.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed())
				.skip(3)
				.collect(Collectors.toList());

		System.out.println(bootom4SalariedEmployees);

		// find sum of all elements in an array using Java 8

		int[] arrays = { 2, 3, 4, 5, 7 };
		int sum = Arrays.stream(arrays).sum();

		System.out.println(sum);

	}
}

class Employee {

	private int id;
	private long salary;

	public Employee(int id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}

}