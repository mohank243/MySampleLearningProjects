package edu.igo.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ListStream {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(20);
		al.add(25);
		List<Integer> list = al.stream().map(i->i+5).collect(Collectors.toList());
		long count = al.stream().filter(i->i<=10).count();
		System.out.println(count);
		Comparator<Integer> c = 
				(l1,l2)->{
				if(l1<l2)
					return -1; 
				else if(l1>l2)
				return 1; 
				else 
					return 0;
				};
				Integer min = al.stream().max(c).get();
				System.out.println(min);
		
		
	}
}
