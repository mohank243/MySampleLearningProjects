package edu.igo.lamdaas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee1{
	String name;
	int sal;
	public Employee1(String name, int i) {
		super();
		this.name = name;
		this.sal = i;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", sal=" + sal + "]";
	}
	
}
public class CustomTypePredicates {

	public static void main(String[] args) {
		List<Employee1> eList = new ArrayList<Employee1>();
		eList.add(new Employee1("Mark", 100000));
		eList.add(new Employee1("Kram", 50000));
		eList.add(new Employee1("Rohit", 500000));
		eList.add(new Employee1("Wrogn", 12000));
		
		Predicate<Employee1> p = (e)->e.sal>=50000;
		for(Employee1 e:eList ) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}
		
 	}
}
