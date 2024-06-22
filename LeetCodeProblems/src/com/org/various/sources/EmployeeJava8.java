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
		employees.add(new Employee(12345, "Akbar", 100, 45000.00));
		employees.add(new Employee(12346, "Amit", 100, 30000.00));
		employees.add(new Employee(12347, "Taufiq", 200, 65000.00));
		employees.add(new Employee(12348, "Raja", 200, 55000.00));
		employees.add(new Employee(12349, "Akash", 300, 64000.00));
		employees.add(new Employee(12350, "Rakesh", 300, 47000.00));
		employees.add(new Employee(12351, "Rachid", 300, 52000.00));
		employees.add(new Employee(12351, "Remit", 200, 57000.00));
		employees.add(new Employee(12351, "Ronit", 100, 59000.00));
		employees.add(new Employee(12351, "Amar", 100, 42000.00));
		employees.add(new Employee(12351, "David", 200, 62000.00));
		employees.add(new Employee(12351, "Rahim", 300, 72000.00));
		employees.add(new Employee(12351, "Abir", 300, 46000.00));

		// Department wise max salary

		Map<Integer, Double> deptWiseMaxSalary = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo,
						Collectors.collectingAndThen(Collectors.maxBy(
								Comparator.comparingDouble(Employee::getSalary)), emp -> emp.get().getSalary())));

		System.out.println("Department wise max salary: " + deptWiseMaxSalary);
	}
}

class Employee
{
	private Integer id;
	private String name;
	private Integer deptNo;
	private Double salary;

	public Employee(Integer id, String name, Integer deptNo, Double salary)
	{
		this.id = id;
		this.name = name;
		this.deptNo = deptNo;
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

	public Integer getDeptNo()
	{
		return deptNo;
	}

	public void setDeptNo(Integer deptNo)
	{
		this.deptNo = deptNo;
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
		return "Employee [id=" + id + ", name=" + name + ", deptNo=" + deptNo + ", salary=" + salary + "]";
	}
}
