package strings;

public class SubsequenceOfstring {
	
	public static boolean isSubstring(String str,String substring) {
		int i=0,j=0;
		while(i<str.length()) {
			if (str.charAt(i)==substring.charAt(j)) {
				if (j==substring.length()-1) {
					return true;
				}
				i++;
				j++;
			}else {
				i++;
			}
		}
		return false;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubstring("abcdef", "abcf"));

	}

}
