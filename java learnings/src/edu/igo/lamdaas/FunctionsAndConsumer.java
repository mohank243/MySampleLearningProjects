package edu.igo.lamdaas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {

	String name;
	int marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

}

public class FunctionsAndConsumer {

	// Function is a predefined functional Interface which is used to perform
	// operation based on the Input and Output types
	// It has a method named apply;

	// public R apply(T);
	// Consumer is a functional Interface which is to print the function
	//Accept some input perform some operation and does not return the result 	
	// public void accept(T);
	// InputType -->Perform Operation -->Return Type

	public static void main(String[] args) {

		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Mark", 100));
		student.add(new Student("Rohit", 45));
		student.add(new Student("Kohli", 18));
		student.add(new Student("Hardik", 33));
		Predicate<Student> p = s -> s.marks > 35;

		Function<Student, String> f = m -> {
			String grade;
			int marks = m.marks;
			if (marks > 80)
				grade = "A";
			else if (marks > 60)
				grade = "B";
			else if (marks > 50)
				grade = "C";
			else if (marks > 35)
				grade = "D";
			else
				grade = "Fail";
			return grade;
		};

		Consumer<Student> c = s -> {
			if (p.test(s))
				System.out.println("Student name " + s.name + " " + f.apply(s));
		};
		for (Student s : student) {
			c.accept(s);
		}
	}
}
