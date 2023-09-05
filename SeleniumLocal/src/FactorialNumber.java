import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		int number=scanner.nextInt();
		int fact=1;
		for(int i=number;i>0;i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
