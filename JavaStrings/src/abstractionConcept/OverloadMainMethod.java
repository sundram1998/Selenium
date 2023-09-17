package abstractionConcept;

public class OverloadMainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		main(0);
		main(0, 0);

	}
	public static void main(int a) {
		// TODO Auto-generated method stub
		System.out.println("main method-int a");

	}
	public static void main(int a,int b) {
		// TODO Auto-generated method stub
		System.out.println("main method-int a int ab");

	}

}
