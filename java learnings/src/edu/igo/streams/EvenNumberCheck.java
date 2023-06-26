package edu.igo.streams;

import java.util.Arrays;

public class EvenNumberCheck {

	public static void main(String[] args) {
		Arrays.asList(12,34,56,21,4).stream().filter(a -> a%2==0).forEach(System.out::println);;
	}
}
