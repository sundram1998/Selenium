package mathematics;

public class CountDigitInANumber {
	
	public int countDigit(int num) {
		if (num==0) {
			return 0;
		}
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDigitInANumber countDigitInANumber=new CountDigitInANumber();
		System.out.println(countDigitInANumber.countDigit(1236789));;

	}

}
