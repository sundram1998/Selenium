package strings;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] str) {

		StringBuffer sBuffer = new StringBuffer();

		Arrays.sort(str);

		char[] fisrt = str[0].toCharArray();
		char[] last = str[str.length - 1].toCharArray();
		
		for(int i=0;i<fisrt.length;i++) {
			if(fisrt[i]!=last[i]) {
				break;
			}
			sBuffer.append(fisrt[i]);
		}
		return sBuffer.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings = { "clap", "clove", "club" };
		String[] strings2= {"flower", "flour", "flourish"};
		System.out.println(longestCommonPrefix(strings));
		System.out.println(longestCommonPrefix(strings2));;
	}

}
