package arrayStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFrequencyOfStringsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("sun", "mon", "tues", "sut", "sun", "mon"));
//
//		Map<String, Long> countMap = arrayList.stream()
//				.collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
//		System.out.println(countMap);
//
//		Map<String, Long> resultMap = arrayList.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(resultMap);

		List<String> names = Arrays.asList("Reflection", "Collection", "Stream","Reflection", "Collection", "Stream");
		Map<String, Long> result = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(result);
		
		HashMap<String, Integer> hsHashMap=new HashMap<String, Integer>();
		for(String s:names) {
			if(hsHashMap.containsKey(s)) {
				hsHashMap.put(s, hsHashMap.get(s)+1);
			}else {
				hsHashMap.put(s, 1);
			}
		}
		System.out.println(hsHashMap);
	}

}
