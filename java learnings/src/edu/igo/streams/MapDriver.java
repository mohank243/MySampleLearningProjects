package edu.igo.streams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDriver {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("NellaiExp", 1800);
		hm.put("TamilNaduExp", 1700);
		hm.put("RajdhaniExp", 2000);
		hm.put("TiruvandrumExp", 2000);
		Set entrySet = hm.entrySet();
		System.out.println(entrySet);
		Iterator setIterator = entrySet.iterator();
		while(setIterator.hasNext()) {
			Object next = setIterator.next();
			Map.Entry mapObject = (Map.Entry)next;
			if(mapObject.getValue().equals(2000))
				System.out.println(mapObject.getKey());
		}
		
	}
}
