package arraysRelatedQuestions;

import java.util.HashMap;
import java.util.Map.Entry;

/* There is String given,Print the duplicate character in it */
public class FindDuplicateCharsInAnString {

	public static void findDuplicates(String str) {

		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				map.put(ch[i], map.get(ch[i]) + 1);
			}
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
// You also use below to print values
//		for (var el : map.entrySet()) {
//			if (el.getValue() > 1) {
//				System.out.println(el.getKey());
//			}
//
//		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "SundramYadav";
		findDuplicates(string);

	}

}
