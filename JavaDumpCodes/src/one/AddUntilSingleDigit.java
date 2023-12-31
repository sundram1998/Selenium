package one;

public class AddUntilSingleDigit {
	
	public static int isSingleDigit(int num) {
		while(num>9) {
			num=sumOfDigits(num);  
		}
		return num;
	}
	
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSingleDigit(12345));

	}

}
