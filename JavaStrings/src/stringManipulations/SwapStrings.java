package stringManipulations;

public class SwapStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="Hello";
		String b="World";
		a=a+b;//HelloWorld
		b=a.substring(0, a.length()-b.length());//Hello
		a=a.substring(a.length()-b.length(), a.length());
		System.out.println(a+" "+b);
	}

}
