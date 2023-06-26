package edu.igo.lamdaas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	String name;
	int eno;
	Employee(String name, int eno){
		this.name = name;
		this.eno = eno;
	}
	@Override
	public String toString() {
		return eno+" : "+name;
	}
	
}
public class AsynchronousLamdas {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("Mark", 1142));
		l.add(new Employee("Sri", 1140));
		l.add(new Employee("Selva", 1141));
		
		System.out.println(l);
//		Collections.sort(l, (e1,e2)-> e1<e2?-1:(e1>e2)?1:0);
		l.sort((e1,e2)-> e1.eno<e2.eno?-1:e1.eno>e2.eno?1:0);
		System.out.println(l);
		
		l.sort((e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(l);
	}
}
