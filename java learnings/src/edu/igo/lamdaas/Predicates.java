package edu.igo.lamdaas;

import java.util.function.Predicate;

//Predicate is a predefined functional Interface used to check Conditions 
/*public abstract boolean test(T t);*/
public class Predicates {

	public static void main(String[] args) {
		Predicate<Integer> p =(i) ->{return (i%2==0);};
		
		System.out.println(p.test(10));
		//Write a Predicate to find the names in the array whose length is greater than 5
		String[] arr = {"Suriya","Jo","karthick","Vikram","Sam"};
		Predicate<String> p1 = (arr1)->arr1.length()>5;
		for(String s1: arr) {
			if(p1.test(s1)) {
				System.out.println(s1);
			}
		}
		
//		for(int i=0; i<arr.length; i++) {
//			
//		}
		
	}
}
