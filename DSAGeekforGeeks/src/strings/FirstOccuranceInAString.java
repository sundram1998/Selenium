 package strings;

public class FirstOccuranceInAString {

	public static void firstOccurance(String haystack, String needle) {
		if (haystack.contains(needle)) {
			System.out.println(haystack.indexOf(needle));
		}
	}

	public static void firstOccr(String hayStackString, String needString) {
		int len = needString.length();
		for (int i = 0; i < hayStackString.length(); i++) {
			String subString = hayStackString.substring(i, len);
			if(subString.equals(needString)) {
//				System.out.println(subString);
				System.out.println(i);
				break;
			}
			len++;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstOccurance("sadbutsad", "sad");
		firstOccr("dsddasdsadbutsad", "sad");

	}

}
