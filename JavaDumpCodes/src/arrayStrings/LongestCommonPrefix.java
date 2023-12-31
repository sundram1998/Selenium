package arrayStrings;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static String longestPrefix(String[] str) {
		
		StringBuffer aBuffer=new StringBuffer();
		Arrays.sort(str);
//		for(String i:str) {
//			System.out.print(i+" ");
//		}
		
		char[] first=str[0].toCharArray();
		char[] last=str[str.length-1].toCharArray();
		
		for(int i=0;i<first.length;i++) {
			if(first[i]!=last[i]) {
				break;
			}
			aBuffer.append(first[i]);
		}
		return aBuffer.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strings= {"Flour","Flower","Flow","Flodous"};
		System.out.println(longestPrefix(strings));

	}

}
