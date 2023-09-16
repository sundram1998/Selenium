package stringManipulations;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		try {
			if(a>b) {
				System.out.println("True");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception caught,a is not greater than b");
		}finally {
			System.out.println("execution completed");
		}

	}

}
