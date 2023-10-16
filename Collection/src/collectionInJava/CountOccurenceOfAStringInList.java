 package collectionInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfAStringInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>(Arrays.asList("sun","mon","tue","wed","Mon"));
		
		Map<String, Long> result = list.stream()
				  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(result);
		
		ArrayList<String> arrayList=new ArrayList<String>();
		
		arrayList.add("sunday");
		arrayList.add("monday");
		arrayList.add("Sunday");
		arrayList.add("monday");
		
		
		Map<String, Long> counterMap=arrayList.stream().collect(Collectors.groupingBy(e->e.toString(),Collectors.counting()));
		System.out.println(counterMap);
		
		
		Set<String> distinct = new HashSet<>(arrayList);
        for (String s: distinct) {
            System.out.println(s + ": " + Collections.frequency(arrayList, s));
        }

		
	}

}
