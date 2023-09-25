package stringManipulations;

import java.util.Scanner;

public class ReverseString {

	public boolean reverseString(String str) {
		int start = 0;
		int end = str.length()-1;
		boolean flag = true;
		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public void withStringBuffer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String");
		String string = scanner.next();
		StringBuffer sBuffer = new StringBuffer(string);
		System.out.println(sBuffer.reverse());

	}

	public void withForLoop() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String");
		String string = scanner.next();
		String revString = " ";
		for (int i = string.length() - 1; i >= 0; i--) {
			revString = revString + string.charAt(i);
		}
		System.out.println(revString.toUpperCase());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rvReverseString = new ReverseString();
//		rvReverseString.withForLoop();  
//		rvReverseString.withStringBuffer();
		System.out.println(rvReverseString.reverseString("strirts"));

	}

}
