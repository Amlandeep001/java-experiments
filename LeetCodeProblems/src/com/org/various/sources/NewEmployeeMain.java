package com.org.various.sources;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class NewEmployeeMain
{
	public static void main(String[] args)
	{
		List<NewEmployee> employees = new ArrayList<>();
		employees.add(new NewEmployee(12345, "Akbar", "HR", 45000.00));
		employees.add(new NewEmployee(12346, "Amit", "HR", 30000.00));
		employees.add(new NewEmployee(12347, "Taufiq", "IT", 65000.00));
		employees.add(new NewEmployee(12348, "Raja", "IT", 55000.00));
		employees.add(new NewEmployee(12349, "Akash", "Sales", 64000.00));
		employees.add(new NewEmployee(12350, "Rakesh", "Sales", 47000.00));
		employees.add(new NewEmployee(12351, "Rachid", "Sales", 52000.00));
		employees.add(new NewEmployee(12352, "Remit", "IT", 57000.00));
		employees.add(new NewEmployee(12353, "Ronit", "HR", 59000.00));
		employees.add(new NewEmployee(12354, "Amar", "HR", 42000.00));
		employees.add(new NewEmployee(12356, "Rahim", "Sales", 72000.00));
		employees.add(new NewEmployee(12357, "Abir", "Sales", 46000.00));

		List<NewEmployee> employeesWithSalaryRange = employees.stream()
				.filter(employee -> employee.salary() > 55000.00 && employee.salary() < 72000.00)
				.toList();

		System.out.println(employeesWithSalaryRange);

		Optional<NewEmployee> optEmployee = employees.stream()
				.sorted(Comparator.comparingDouble(NewEmployee::salary).reversed())
				.skip(3)
				.findFirst();

		System.out.println("4th Max Salaried Employee: " + optEmployee.orElse(null));

		Map<String, Long> deptWiseCount = employees.stream()
				.collect(Collectors.groupingBy(NewEmployee::deptNo, Collectors.counting()));

		System.out.println("Dept wise employee count: " + deptWiseCount);

		Map<String, Long> orderedCountDeptWise = deptWiseCount.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
						(e1, e2) -> e1, LinkedHashMap::new));

		System.out.println("Dept wise employee count in descending order: " + orderedCountDeptWise);

		Map<String, Double> deptWiseMaxSalary = employees.stream()
				.collect(Collectors.groupingBy(NewEmployee::deptNo,
						Collectors.collectingAndThen(Collectors.toList(),
								list -> list.stream()
										.max(Comparator.comparingDouble(NewEmployee::salary))
										.map(NewEmployee::salary)
										.get())));

		System.out.println("Dept wise max salary: " + deptWiseMaxSalary);
	}
}
