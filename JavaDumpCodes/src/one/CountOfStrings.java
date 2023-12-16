package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountOfStrings {
	
	public static void countOccurence(ArrayList<String> al) {
		Map<String, Long> countHashMap=al.stream().collect(Collectors.groupingBy(e->e.toString(),Collectors.counting()));
		System.out.println(countHashMap);
	}
	
	public static void occurance(ArrayList<String> aList) {
		Set<String> countSet=new HashSet<String>(aList);
		for(String iString:countSet) {
			System.out.print(iString+" :"+Collections.frequency(aList, iString)+" ,");
		}
	}
	
	public static void occuranceUsingHashSet(ArrayList<String> aList) {
		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
		for(String s:aList) {
			if(hashMap.containsKey(s)) {
				hashMap.put(s, hashMap.get(s)+1);
			}else {
				hashMap.put(s, 1);
			}
		}
		System.out.println(hashMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> aList=new ArrayList<String>(Arrays.asList("sun","mon","tues","wed","thirs","sun","mon"));
//		countOccurence(aList);
//		occurance(aList);
		occuranceUsingHashSet(aList);

	}

}
