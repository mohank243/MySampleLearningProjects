package edu.igo.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {

	public static void main(String[] args) {
		ArrayList<String> st= new ArrayList<String>();
		st.add("RTG");
		st.add("Straddle Carrier");
		st.add("Reach Stacker");
		st.add("QuayCrane");
		st.add("Internal Terminal Vehicle");
		
		List<String> assendingSort = st.stream().sorted().collect(Collectors.toList());
		System.out.println(assendingSort);
		Comparator<String> c = (s1,s2) -> {
			if(s1.length()<s2.length())
				return -1;
			else if(s1.length()>s2.length())
				return 1;
			else return s1.compareTo(s2);
		};
		List<String> characterSizeSort = st.stream().sorted(c).collect(Collectors.toList());
		System.out.println(characterSizeSort);
		
	}
}
