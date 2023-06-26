package edu.igo.lamdaas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsLamdas {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(48);
		l.add(15);
		l.add(12);
		l.add(56);
		Collections.sort(l,(i1,i2)->i1<i2?1:(i1>i2)?-1:0);
		System.out.println(l);
	}
}
