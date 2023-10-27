package strings;

public class LeftMostRepeatingCharector {
	
	public static int leftMostChar(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if (str.charAt(i)==str.charAt(j)) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="acdd";
		if(leftMostChar(string)>=0) {
			System.out.println(string.charAt(leftMostChar(string)));
		}else {
			System.out.println(leftMostChar(string));
		}
		

	}

}
