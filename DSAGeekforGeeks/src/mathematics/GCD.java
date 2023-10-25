package mathematics;

public class GCD {

	public static int gcdByModulerDivision(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcdByModulerDivision(b, a % b);
		}
	}

	public static int gcdOfTwoNumbers(int a, int b) {

		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}

		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcdOfTwoNumbers(4, 6));
		System.out.println(gcdByModulerDivision(4, 6));
	}

}
