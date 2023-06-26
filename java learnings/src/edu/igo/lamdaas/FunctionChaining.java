package edu.igo.lamdaas;

import java.util.function.Function;

public class FunctionChaining {

	//Function chaining is the concept of performing operations using multiple functions
	//It has methods named andThen(Function f) first f1 and then f2, compose(Function f) first f2 and then f1
	
	public static void main(String[] args) {
		Function<Integer,Integer> f = i->i*3;
		Function<Integer,Integer> f2 = i->i*i;
		System.out.println(f.andThen(f2).apply(8));
	}
}
