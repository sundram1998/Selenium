package strings;

import java.util.HashMap;
import java.util.Set;

public class CountStrings {

	public static void countString(String str) {
		String[] strArrayStrings = str.split(" ");

		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		for (String word : strArrayStrings) {
			if (countMap.containsKey(word)) {
				countMap.put(word, countMap.get(word) + 1);
			} else {
				countMap.put(word, 1);
			}
		}

		Set<String> hSet = countMap.keySet();
		for (String word : hSet) {
			System.out.println(word + " : " + countMap.get(word));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countString("100 200 100 300 200 400");

	}

}
