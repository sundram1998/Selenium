package stringManipulations;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=12321;
		int storeNum=num;
		int rev=0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if (rev==storeNum) {
			System.out.println("This is a palindrome number");
		}else {
			System.out.println("This is not a palindrome number");
		}
	}

}
