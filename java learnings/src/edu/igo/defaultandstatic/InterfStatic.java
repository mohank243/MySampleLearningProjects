package edu.igo.defaultandstatic;

public interface InterfStatic {

	default  void m1() {
		//static methods are used in the interface to provide the utility methods
		//By default static methods are not available to the implementation class we need to call by using Interface Name
		System.out.println("Hi this is static Method");
	}
	public static void main(String[] args) {
		InterfStatic d = new InterfStatic() {
			public void m1() {
				System.out.println("Hi this is Implementation of M1");
			}
		};
		d.m1();
	}
}


