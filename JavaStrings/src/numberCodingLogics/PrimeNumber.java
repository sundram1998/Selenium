package numberCodingLogics;

public class PrimeNumber {

	public boolean isPrime(int num) {
		if (num<=1) {
			return false;
		}
		Boolean flagBoolean=true;
		for(int i=2;i<num/2;i++) {
			if(num%i==0) {
				flagBoolean=false;
			}
		}
		if (flagBoolean==false) {
			return false;
		}else {
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pmNumber=new PrimeNumber();
		System.out.println(pmNumber.isPrime(13));
		
 
	}

}
