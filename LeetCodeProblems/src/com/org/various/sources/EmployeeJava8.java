package com.org.various.sources;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeJava8
{
	public static void main(String[] args)
	{
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(12345, "Akbar", "HR", 45000.00));
		employees.add(new Employee(12346, "Amit", "HR", 30000.00));
		employees.add(new Employee(12347, "Taufiq", "IT", 65000.00));
		employees.add(new Employee(12348, "Raja", "IT", 55000.00));
		employees.add(new Employee(12349, "Akash", "Sales", 64000.00));
		employees.add(new Employee(12350, "Rakesh", "Sales", 47000.00));
		employees.add(new Employee(12351, "Rachid", "Sales", 52000.00));
		employees.add(new Employee(12352, "Remit", "IT", 57000.00));
		employees.add(new Employee(12353, "Ronit", "HR", 59000.00));
		employees.add(new Employee(12354, "Amar", "HR", 42000.00));
		employees.add(new Employee(12355, "David", "IT", 62000.00));
		employees.add(new Employee(12356, "Rahim", "Sales", 72000.00));
		employees.add(new Employee(12357, "Abir", "Sales", 46000.00));

		// Department wise max salary

		Map<String, Double> deptWiseMaxSalary = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.collectingAndThen(Collectors.maxBy(
								Comparator.comparingDouble(Employee::getSalary)), emp -> emp.get().getSalary())));

		System.out.println("Department wise max salary: " + deptWiseMaxSalary);

		// Department wise Students' names

		Map<String, List<String>> deptWiseNames = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.mapping(Employee::getName, Collectors.toList())));

		System.out.println("Department wise Students' names: " + deptWiseNames);
	}
}

class Employee
{
	private Integer id;
	private String name;
	private String deptName;
	private Double salary;

	public Employee(Integer id, String name, String deptName, Double salary)
	{
		this.id = id;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}

	public Integer getId()
	{
		return id;
	}

	public void setId(Integer id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDeptName()
	{
		return deptName;
	}

	public void setDeptName(String deptName)
	{
		this.deptName = deptName;
	}

	public Double getSalary()
	{
		return salary;
	}

	public void setSalary(Double salary)
	{
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", name=" + name + ", deptName=" + deptName + ", salary=" + salary + "]";
	}
}
