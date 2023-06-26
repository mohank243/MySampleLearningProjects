package edu.igo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLenght {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "banana", "orange", "grape");
		Map<Integer, List<String>> collect = fruits.stream().collect(Collectors.groupingBy(s->s.length()));
		System.out.println(collect);
		
	}
}
