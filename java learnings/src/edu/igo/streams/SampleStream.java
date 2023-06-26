package edu.igo.streams;

import java.util.Arrays;
import java.util.List;

public class SampleStream {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(12,56,89,62,65,89);
		long count = asList.stream().filter(m->m<=35).count();
		System.out.println(count);
		
		
	}
}
