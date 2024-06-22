package com.org.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalary
{
	public static void main(String... a)
	{
		List<Employee> employees = Arrays.asList(
				new Employee(1, 25, 25000, "male"),
				new Employee(2, 20, 15000, "male"),
				new Employee(3, 35, 27000, "female"),
				new Employee(4, 30, 28000, "male"),
				new Employee(5, 28, 32000, "female"),
				new Employee(6, 22, 37000, "male"));

		Double avgSalary = employees.stream()
				.filter(e -> e.getAge() >= 25 && e.getAge() <= 35)
				.collect(Collectors.averagingInt(Employee::getSalary));

		System.out.println(avgSalary);

		Map<String, Long> map = employees.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);
	}

}

class Employee
{
	int id;
	int age;
	int salary;
	String gender;

	public Employee(int id, int age, int salary, String gender)
	{
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	public int getSalary()
	{
		return salary;
	}

	public void setSalary(int salary)
	{
		this.salary = salary;
	}

	public String getGender()
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + ", gender=" + gender + "]";
	}
}
