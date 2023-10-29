package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementInArray {

	public static void duplicateElement(String[] arr) {
		Set<String> set = new HashSet<String>();
		for (String e : arr) {
			if (set.add(e) == false) {
				System.out.println(e);
			}
		}
	}

	public static void duplicateElements(String[] arr) {
		ArrayList<String> arrayList = new ArrayList<String>();

		for (String e : arr) {
			arrayList.add(e);
		}
		
		Map<String, Long> countMap = arrayList.stream()
				.collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
		System.out.println(countMap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = { "a", "b", "c", "a", "c" };
		duplicateElement(arr);
		duplicateElements(arr);

	}
}