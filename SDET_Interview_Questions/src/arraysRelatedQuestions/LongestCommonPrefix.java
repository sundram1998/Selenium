package arraysRelatedQuestions;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static void longestComPrefix(String[] str) {
		
		StringBuffer sBuffer=new StringBuffer();
		Arrays.sort(str);
		
		char[] first=str[0].toCharArray();
		char[] last=str[str.length-1].toCharArray();
		
		for(int i=0;i<first.length;i++) {
			if(first[i]!=last[i]) {
				break;
			}
			sBuffer.append(first[i]);
		}
		System.out.println(sBuffer);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings= {"Flower","Floor","Flout","Floutus"};
		longestComPrefix(strings);

	}

}
