package stringManipulations;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="newString";
		char[] str=string.toCharArray();
		
		Set<Character> set=new HashSet<Character>();
		for(char i:str) {
			if(set.add(i)==false) {
				System.out.println(i+" is duplicate");
			}
		}

	}

}
