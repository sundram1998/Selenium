package one;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static String longestCommonPrefix(String[] strsStrings) {
		StringBuffer sBuffer=new StringBuffer();
		Arrays.sort(strsStrings);
		
		char[] first=strsStrings[0].toCharArray();
		char[] last=strsStrings[strsStrings.length-1].toCharArray();
		
		for(int i=0;i<last.length;i++) {
			if (first[i]!=last[i]) {
				break;
			}
			sBuffer.append(first[i]);
		}
		return sBuffer.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","floght"};
		System.out.println(longestCommonPrefix(strs));

	}

}
