package stringManipulations;

import java.util.Arrays;

public class LongestCommonPrefix {
	
	public static void langestCommonPrefix(String[] a) {
		
		StringBuffer sBuffer=new StringBuffer();
		Arrays.sort(a);
		char[] first=a[0].toCharArray();
		
		char[] last=a[a.length-1].toCharArray();
		
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
 
		String[] array= {"Flower","Floor","Flout","Flow","Floudous"};
		langestCommonPrefix(array);
	}
 
}
