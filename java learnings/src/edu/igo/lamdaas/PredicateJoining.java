package edu.igo.lamdaas;

import java.util.function.Predicate;

public class PredicateJoining {

	//Predicate joining is the concept of checking two conditions at a time using the
	//utility methods present inside the Predicate Interface 
	
	public static void main(String[] args) {
		int [] i = {12,23,544,65,34,2,67,8,6,76};
		//checking the number is odd and it is greater than 10;
		Predicate<Integer> check1 = (n1)->n1%2==1;
		Predicate<Integer> check2 = n2->n2>10;
		for(int ei:i) {
			if(check1.and(check2).test(ei))
				System.out.println(ei);
			
			
		}
		
	}
}
