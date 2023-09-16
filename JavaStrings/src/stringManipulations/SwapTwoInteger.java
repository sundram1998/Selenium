package stringManipulations;

public class SwapTwoInteger {
	public static void main(String[] args) {
		int a=10;
		int b=20;
//		a=a+b;//a=30
//		b=a-b;//b=30-20=10
//		a=a-b;//a=30-10=20
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println(a+" "+b);
	}

}
