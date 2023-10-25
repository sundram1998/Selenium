package mathematics;

public class PrimeFactorsOfANumber {

	public static void getPrimeFactors(int num) {
		for (int i = 2; i < num; i++) {
			if (CheckPrimeNumber.isPrime(num)) {
				int x = i;
				while (num % x == 0) {
					System.out.println(i);
					x = x * i;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
