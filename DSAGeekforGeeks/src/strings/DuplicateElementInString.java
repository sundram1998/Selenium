package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementInString {

	public static void duplicate(String str) {
		char[] str1 = str.toCharArray();

		ArrayList<Character> aList = new ArrayList<Character>();
		for (char a : str1) {
			aList.add(a);
		}
		Map<Object, Long> countMap = aList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countMap);
		Map<Object, Long> countMap1 = aList.stream()
				.collect(Collectors.groupingBy(e->e.toString(), Collectors.counting()));
		System.out.println(countMap1);
// Second Method By HashSet Without converting the char array to arrayList
		Map<Character, Integer> countMap2=new HashMap<Character, Integer>();
		for(char a:str1) {
			if(countMap2.containsKey(a)) {
				countMap2.put(a, countMap2.get(a)+1);
			}else {
				countMap2.put(a, 1);
			}
		}
		System.out.println(countMap2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicate("jayshreeram");
	}

}
