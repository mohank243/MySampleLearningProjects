 package edu.igo.lamdaas;
class Student1 {
	String name;
	int rollno;
	int marks;
	public Student1(String name, int rollno, int marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", marks=" + marks + "]";
	}
	
	
	
}

interface Interf1{
	public Student1 get(String name, int rollno, int marks);
}
public class ConstructorReference {

	public static void main(String[] args) {
		Interf1 i = Student1::new;
		i.get("mark",  45, 45);
	}
}
