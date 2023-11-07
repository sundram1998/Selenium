package arrayStrings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsInString {
	
	public static void duplicatesUsingCollectors(String str) {
		String[] strArrayStrings=str.split(" "); 
		List<String> list=new ArrayList<String>();
		for(String s:strArrayStrings) {
			list.add(s);
		}
		Map<String, Long> countMap=list.stream().collect(Collectors.groupingBy(e->e.toString(),Collectors.counting()));
		System.out.println(countMap);
		Map<String, Long> countMap1=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(countMap1);
	}
	
	public static void duplicatesUsingCollection(String str) {
		String[] strArrayStrings=str.split(" "); 
		List<String> list=new ArrayList<String>();
		for(String s:strArrayStrings) {
			list.add(s);
		}
		
		Set<String> set=new HashSet<String>(list);
		set.add("hello");
		for(String s:set) {
			System.out.println("Frequency of "+s+" is "+Collections.frequency(list, s));
		}
		
	}

	public static void duplicateWordsUsingMap(String str) {

		String[] strArray = str.split(" ");
		Map<String, Integer> hMapCount=new HashMap<String, Integer>();
		for(String s:strArray) {
			if(hMapCount.containsKey(s)) {
				hMapCount.put(s, hMapCount.get(s)+1);
			}else {
				hMapCount.put(s, 1);
			}
		}
		System.out.println(hMapCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "This is java code finding duplicates words in java code words";
		duplicateWordsUsingMap(string);
//		duplicatesUsingCollection(string);
		duplicatesUsingCollectors(string);

	}

}
