package stringManipulationDuplicate;

import java.util.Arrays;

public class IsAnagram {
	
	public static boolean isAnagram(String a,String b) {
		if(a.length()!=b.length()){
			return false;
		}
		char[] s1=a.toCharArray();
		Arrays.sort(s1);
		a=new String(s1);
		
		char[] s2=b.toCharArray();
		Arrays.sort(s2);
		b=new String(s2);
		
		return a.equals(b);
	}
	
	public static void main(String[] args) {
		System.out.println(isAnagram("sundram", "sundram"));;
	}

}
