package edu.igo.defaultandstatic;

interface Interf2{
	//Without effecting the implementation classes we can add methods to the Interface so that default method concept is came
	default void m1() {
		System.out.println("default Method of Interf 2");
	}
	
}
public interface Interf {

	default void m1() {
		System.out.println("default Method from Interf 1");
	}
}
