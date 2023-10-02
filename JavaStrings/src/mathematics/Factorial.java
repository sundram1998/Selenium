package mathematics;

public class Factorial {

	public int factorialOfByRecursion(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorialOfByRecursion(n - 1);
	}

	public int factorialOf(int n) {
		int fact = 1;
		if (n == 0) {
			return -1;
		}
		while (n != 1) {
			fact = fact * (n);
			n = n - 1;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial = new Factorial();
		System.out.println(factorial.factorialOf(0));
		System.out.println(factorial.factorialOfByRecursion(9));

	}

}
