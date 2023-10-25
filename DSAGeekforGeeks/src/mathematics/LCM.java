package mathematics;

public class LCM {

	public static int lcmOftwoNumbers(int a, int b) {

		return a * b / GCD.gcdByModulerDivision(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lcmOftwoNumbers(4, 6));
	}

}
