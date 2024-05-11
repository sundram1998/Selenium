package stringManipulations;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInString {
	
	public static void printDup() {
		String a="abcsdabcs";
		char[] str=a.toCharArray();
		
		Set<Character> set=new HashSet<Character>();
		for(char i:str) {
			if(set.add(i)==false) {
				System.out.println(i+" "+"is duplicate");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDup();

	}

}
