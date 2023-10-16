package collectionInJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraylistConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> aList=new ArrayList<String>();
		aList.addAll(Arrays.asList("a","b","c","a","b","d"));
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4));
		
		System.out.println(al);
		System.out.println(aList);
		
		Set<String> set=new HashSet<String>(aList);
		for(String s:set) {
			System.out.println(s+": "+Collections.frequency(aList, s));
		}
		
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		Set<Integer> set2=new HashSet<Integer>(al);
		for(Integer s:set2) {
			System.out.println(s+": "+Collections.frequency(al, s)+" times");
			map.put(s, Collections.frequency(al, s));			
		}
		System.out.println(map);
	}

}
