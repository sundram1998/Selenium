package mathematics;

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {
		int cubicSum = 0;
		int orinum=num;
		while (num > 0) {
			int lastDigit = (num % 10);
			cubicSum = (int) (cubicSum + Math.pow(lastDigit, 3));
			num = num / 10;
		}
		if (orinum == cubicSum) {		
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isArmstrong(153));
	}

}
