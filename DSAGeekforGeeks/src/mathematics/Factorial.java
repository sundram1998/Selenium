package mathematics;

public class Factorial {
	
	public int factorialByRecusion(int num) {
		if(num==0) {
			return 1;
		}
		
		return num*factorialByRecusion(num-1);
	}
	
	public int factorialByLoop(int num) {
		int fact=1;
		for(int i=2;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial factorial=new Factorial();
		System.out.println(factorial.factorialByRecusion(5));
		System.out.println(factorial.factorialByLoop(5));

	}

}
