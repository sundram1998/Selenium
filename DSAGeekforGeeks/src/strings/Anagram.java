package strings;

import java.util.Arrays;

public class Anagram {

	public static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] aString = s1.toCharArray();
		Arrays.sort(aString);
		s1 = new String(aString);

		char[] bString = s2.toCharArray();
		Arrays.sort(bString);
		s2 = new String(bString);

		return s1.equals(s2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("aabbss", "aabbssS"));
	}

}
