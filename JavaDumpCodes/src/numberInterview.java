
public class numberInterview {
	
	public static int isSinle(int num) {
		
		while(num>9) {
			num=sumOfdigit(num);
		}
		return num;
	}
	
	public static int sumOfdigit(int num) {
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;		
		}
		return sum;
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSinle(12345));
		
	}

}
