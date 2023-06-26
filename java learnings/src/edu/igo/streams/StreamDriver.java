package edu.igo.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDriver {

	public static void main(String[] args) {
		List<Object> asList = Arrays.asList(1,23,4,34,25,4,4);
		List<String> collect = asList.stream().map(s -> s+"").filter(s->s.startsWith("2")).collect(Collectors.toList());
		List<Object> collect2 = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(asList);
		System.out.println(collect2);
		System.out.println(String.join(".", Arrays.asList("Mark","clenaghan")));
		System.out.println(String.format("Hi This is %s", "mark"));
		List employee = new ArrayList();
		employee.add(new Employee("Mohan",21,"male","IT"));
		employee.add(new Employee("Selva",23,"male","HR"));
		employee.add(new Employee("Sri",24,"male","IT"));
		employee.add(new Employee("kdy", 34, "female", "HR"));
		
		@SuppressWarnings("unchecked")
		Map<String,Long> collect3 = (Map<String, Long>) employee.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(collect3);
		Object collect4 = employee.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(collect4);
		
	}
}
