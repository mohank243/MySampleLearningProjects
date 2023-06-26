package edu.igo.lamdaas;

import java.util.function.BiFunction;

public class BiFunctionSample {

	//BiFunction is a predefined Functional Interface which is used to perform some operation with two input arguments and return the result
	public static void main(String[] args) {
		BiFunction<Employee,Student,Integer> b = (e , s)-> {
			return e.eno+s.marks;
		} ;
		System.out.println(b.apply(new Employee("Rohit",30 ), new Student("Sharma",15)));
	}
	
}
