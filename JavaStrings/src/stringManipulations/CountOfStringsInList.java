package stringManipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountOfStringsInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("Satyam", "Shivam", "Sundram"));
		System.out.println(arrayList);

//		Map<String, Long> result = arrayList.stream()
//				.collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
//		System.out.println(result);
		
		Set<String> distinct = new HashSet<>(arrayList);
        for (String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(arrayList, s));
        }
        

	}

}
