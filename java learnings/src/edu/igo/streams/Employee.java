package edu.igo.streams;

public class Employee {

	String name;
	int age;
	String gender;
	String department;
	public Employee(String name, int age, String gender, String department) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department + "]";
	}
	
}
