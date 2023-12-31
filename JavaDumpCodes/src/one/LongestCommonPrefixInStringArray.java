package one;

import java.util.Arrays;

public class LongestCommonPrefixInStringArray {
	
	public static String longestPrefix(String[] str) {
		StringBuffer sBuffer=new StringBuffer();
		
		char[] firString=str[0].toCharArray();
//		Arrays.sort(firString);
		
		char[] lastString=str[str.length-1].toCharArray();
//		Arrays.sort(lastString);
		
		for(int i=0;i<firString.length;i++) {
			if(firString[i]!=lastString[i]) {
				break;
			}
			sBuffer.append(firString[i]);
		}
		return sBuffer.toString();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings= {"java","javaaawa","javaicelabnd"};
		System.out.println(longestPrefix(strings));

	}

}
