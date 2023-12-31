package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccurencesofStringInList {
	
	public static void occurencesOfString(List<String> list) {
		HashMap<String, Integer> hMap=new HashMap<String, Integer>();
		for(String i:list) {
			if(hMap.containsKey(i)) {
				hMap.put(i, hMap.get(i)+1);
			}else {
				hMap.put(i, 1);
			}
		}
		System.out.println(hMap);
	}
	public static void occurencesOfStringByMap(List<String> list) {
		Map<String, Long> hMap=list.stream().collect(Collectors.groupingBy(e->e.toString(),Collectors.counting()));
		System.out.println(hMap);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> aList=new ArrayList<String>(Arrays.asList("mon","tues","wed"));
		occurencesOfString(aList);

	}

}
