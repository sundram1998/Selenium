package arrayStrings;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInString {
	
	public static void duplicates(String str) {
		
		char[] ch=str.toCharArray();
		Set<Character> set=new HashSet<Character>();
		for(char i:ch) {
			if(set.add(i)==false) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicates("javajv");

	}

}
