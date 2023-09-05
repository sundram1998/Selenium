
public class CountDigitInANumber {
	
	public static void main(String[] args) {
		int num=123445;
		int count=0;
		int sum=0;
		while(num>0) {
			count++;
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(count);
		System.out.println(sum);
	}

}
