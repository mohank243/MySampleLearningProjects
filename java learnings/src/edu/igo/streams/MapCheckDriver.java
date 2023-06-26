package edu.igo.streams;

import java.util.HashMap;
import java.util.Map;

public class MapCheckDriver {

	public static void main(String[] args) {
		Map<Object, Object> hashMap = new HashMap<>();
		hashMap.put(1, "Mark");
		hashMap.put(2, "Clenaghan");
		System.out.println(hashMap.get(3));
		System.out.println(hashMap);
	}
}
