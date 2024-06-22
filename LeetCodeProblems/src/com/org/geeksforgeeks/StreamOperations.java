package com.org.geeksforgeeks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamOperations
{
	public static void main(String[] args)
	{
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(12345, "Aksar", 100, 35678, 45000.00));
		employees.add(new Employee(12346, "Amit", 100, 98765, 30000.00));
		employees.add(new Employee(12347, "Taufiq", 200, 67890, 65000.00));
		employees.add(new Employee(12348, "Raja", 200, 56789, 55000.00));
		employees.add(new Employee(12349, "Rohit", 300, 45678, 64000.00));
		employees.add(new Employee(12350, "Rakshit", 300, 78907, 47000.00));
		employees.add(new Employee(12351, "Rachin", 300, 89056, 52000.00));
		employees.add(new Employee(12351, "Romit", 200, 89056, 57000.00));
		employees.add(new Employee(12351, "Rohit", 100, 89056, 59000.00));
		employees.add(new Employee(12351, "Amar", 100, 89056, 42000.00));
		employees.add(new Employee(12351, "David", 200, 89056, 62000.00));
		employees.add(new Employee(12351, "Rahim", 300, 89056, 72000.00));
		employees.add(new Employee(12351, "Kaushik", 300, 89056, 46000.00));

		// get only employee names whose Salary > 50k
		List<String> enames = employees.stream()
				.filter(e -> e.getSalary() > 50000)
				.map(a -> a.getName())
				.collect(Collectors.toList());
		System.out.println("Employees with salaries greater than 50k: " + enames);

		// Department wise employees information
		Map<Integer, List<Employee>> deptemployees = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo));

		System.out.println("Department wise employees information : " + deptemployees);

		/*Map<Integer, Optional<Employee>> highestCodeCommitsByDeptNo = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo, Collectors.maxBy(Comparator.comparingInt(Employee::getCodeCommits))));
		
		highestCodeCommitsByDeptNo.forEach((deptNo, employee) ->
		{
			employee.ifPresent(emp -> System.out.println("Department: " + deptNo + ", Employee with highest code commits: " + emp.getName()));
		});*/

		// Department wise maximum salary
		Map<Integer, Double> deptEmployeesMap = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo,
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
								emp -> emp.get().getSalary())));

		System.out.println("Department wise maximum salary : " + deptEmployeesMap);

		Map<Integer, Optional<Employee>> deptEmployees = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDeptNo,
						Collectors.reducing(BinaryOperator.maxBy(
								Comparator.comparingDouble(Employee::getSalary)))));

		System.out.println("Department wise maximum salaried employee : " + deptEmployees);

		// 10th Highest salaried employee records
		Optional<Employee> emp = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.skip(9)
				.findFirst();
		System.out.println("10th Highest salaried employee records: " + emp.get());

		Map<Integer, Employee> highestCodeCommitsByDept = new HashMap<>();

		for(Employee employee : employees)
		{
			if(!highestCodeCommitsByDept.containsKey(employee.getDeptNo()))
			{
				highestCodeCommitsByDept.put(employee.getDeptNo(), employee);
			}
			else
			{
				Employee prevEmployee = highestCodeCommitsByDept.get(employee.getDeptNo());
				if(employee.getCodeCommits() > prevEmployee.getCodeCommits())
				{
					highestCodeCommitsByDept.put(employee.getDeptNo(), employee);
				}
			}
		}

		// Print the result
		for(Map.Entry<Integer, Employee> entry : highestCodeCommitsByDept.entrySet())
		{
			System.out.println("Department: " + entry.getKey() + ", Employee with highest code commits: " + entry.getValue().getName());
		}
	}
}

class Employee
{
	private Integer id;
	private String name;
	private Integer deptNo;
	private Integer codeCommits;
	private Double salary;

	public Employee(Integer id, String name, Integer deptNo, Integer codeCommits, Double salary)
	{
		this.id = id;
		this.name = name;
		this.deptNo = deptNo;
		this.codeCommits = codeCommits;
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

	public Integer getCodeCommits()
	{
		return codeCommits;
	}

	public void setCodeCommits(Integer codeCommits)
	{
		this.codeCommits = codeCommits;
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
		return "Employee [id=" + id + ", name=" + name + ", deptNo=" + deptNo + ", codeCommits=" + codeCommits + ", salary=" + salary + "]";
	}

}
