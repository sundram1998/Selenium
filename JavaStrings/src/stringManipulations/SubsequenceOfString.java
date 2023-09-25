package stringManipulations;

public class SubsequenceOfString {
	
	public boolean isSubstring(String str,String substring) {
		int j=0;
		int i=0;
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
		SubsequenceOfString sbOfString=new SubsequenceOfString();
		System.out.println(sbOfString.isSubstring("ABCDEF", "ADEFG"));

	}

}
