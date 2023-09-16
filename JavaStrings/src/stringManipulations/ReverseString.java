package stringManipulations;

import java.util.Scanner;

public class ReverseString {
	
	public void withStringBuffer() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The String");
		String string=scanner.next();
		StringBuffer sBuffer=new StringBuffer(string);
		System.out.println(sBuffer.reverse());
		
	}
	
	public void withForLoop() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The String");
		String string=scanner.next();
		String revString=" ";
		for(int i=string.length()-1;i>=0;i--) {
			revString=revString+string.charAt(i);
		}
		System.out.println(revString.toUpperCase());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rvReverseString=new ReverseString();
//		rvReverseString.withForLoop();  
		rvReverseString.withStringBuffer();

	}

}
