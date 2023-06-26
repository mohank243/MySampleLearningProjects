package edu.igo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntegerArrayStream {
//Stream.of is used toconvert array into Strem; 
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(212,362,673,765,764,142);
		;
		Stream.of(asList.stream().toArray(Integer[]::new)).forEach(System.out::println);
	}
}
