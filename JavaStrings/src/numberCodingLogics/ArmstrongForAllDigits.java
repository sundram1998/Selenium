package numberCodingLogics;

public class ArmstrongForAllDigits {
	/*
	 * An Armstrong number of three digits is an integer such that the sum of the
	 * cubes of its digits is equal to the number itself. For example, 371 is an
	 * Armstrong number since 3**3 + 7**3 + 1**3 = 371.
	 */

	public int numOfDigits(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}

	public boolean isArmstrong(int num) {
		int storeNum = num;
		int digitCount=numOfDigits(num);
		int sumOfDigits = 0;
		while (num > 0) {
			sumOfDigits = (int) (sumOfDigits + (Math.pow(num % 10, digitCount)));
			num = num / 10;
		}
		if (sumOfDigits == storeNum) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArmstrongForAllDigits amArmstrongNumber = new ArmstrongForAllDigits();
		if (amArmstrongNumber.isArmstrong(153)) {
			System.out.println("This is an armstrong number");
		}else {
			System.out.println("This is not an armstrong number");
		}
		
	}

}
