package numberCodingLogics;

public class FactorialOfNumbers {
	//Recursion
	public int factOf(int num) {
		if (num==1) {
			return num;
		}
		return factOf(num-1)*num;
	}
	
	public int factorialOf(int num) {
		int fact=1;
		while(num!=1) {
			fact=fact*num;
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialOfNumbers factorialOfNumbers=new FactorialOfNumbers();
		System.out.println(factorialOfNumbers.factorialOf(6));
		System.out.println(factorialOfNumbers.factOf(5));

	}

}
