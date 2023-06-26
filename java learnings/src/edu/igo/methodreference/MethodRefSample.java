package edu.igo.methodreference;

public class MethodRefSample{
	
	//Method reference is used to perform code reusability by using the method from a class and referencing it to a another method
	//Method reference is alternate syntax for Lamba Expressions
	//In case of Method Reference different return types are allowed but only restriction argument type must be matched
	public static void main(String[] args) {
		
		Runnable r = MethodRefSample::m1;
		new Thread(r).start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
	public static int m1() {
		for(int i=0;i<10;i++) {
			System.out.println("Child Thread");
		}
		return 232;
	}
}
