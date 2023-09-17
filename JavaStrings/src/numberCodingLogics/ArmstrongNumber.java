package numberCodingLogics;

public class ArmstrongNumber {
	/*
	 An Armstrong number of three digits is an integer such that the sum of the
	 cubes of its digits is equal to the number itself. For example,
	  371 is an Armstrong number since 3**3 + 7**3 + 1**3 = 371.
	 */

	public boolean isThree(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		if(count!=3) {
			System.out.println(count);
			return false;
		}
		return true;
	}
	public boolean isArmstrong(int num) {
		int storeNum=num;
		if (isThree(num)==true) {
			int sqrSum=0;
			while(num>0) {
				sqrSum=(int) (sqrSum+(Math.pow(num%10, 3)));
				System.out.println(sqrSum);
				num=num/10;
			}
			if (sqrSum==storeNum) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArmstrongNumber amArmstrongNumber=new ArmstrongNumber();
		System.out.println(amArmstrongNumber.isArmstrong(371));
	}

}
