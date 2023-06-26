package edu.igo.lamdaas;

import java.util.function.BiPredicate;

public class BiPredicateSample {

	//BiPredicate is a class which will take two input arguments and checks whether the condition is true or not
	public static void main(String[] args) {
		BiPredicate<Integer , Integer> p = (s,r)->s>r;
		System.out.println(p.test(1, 2));
	}
}
