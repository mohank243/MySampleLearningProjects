package edu.igo.lamdaas;

import java.util.function.BiConsumer;

public class BiConsumerSample {

	//BiConsumer is a functional Interface which is used to perform operation using the two inputs and it does not return any thing
	public static void main(String[] args) {
		BiConsumer<Integer,Integer > b = (i,j)->System.out.println(i+j); 
		b.accept(1, 2);
	}
}
