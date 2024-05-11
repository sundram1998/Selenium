import abstractionConcept.interviewDemo;

public class FibonacciNumber {
	
	public static void printFibonacciSeries(int n) {
		int num1=0;
		int num2=1;
		for(int i=0;i<=n;i++) {
			System.out.print(num1+" ");
			int num3=num2+num1;
			num1=num2;
			num2=num3;	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printFibonacciSeries(10);
	}

}
