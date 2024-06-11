package arraysRelatedQuestions;

import java.util.Arrays;

public class CheckAnagram {
	
	public static boolean isAnagram(String a,String b) {
		
		if(a.length()!=b.length()) return false;
		char[] c=a.toCharArray();
		Arrays.sort(c);
		a=new String(c);
		
		char[] d=b.toCharArray();
		Arrays.sort(d);
		b=new String(d);
		
		return a.equals(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aString="abdsa";
		String bString="asdba";
		System.out.println(isAnagram(aString, bString));

	}

}
