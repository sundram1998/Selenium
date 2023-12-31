
public class numberInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int sum=0;
		while(num>0 || sum>9) {
			sum+=num%10;
			num=num/10;
			if(num==0) {
				num=sum;
				sum=0;
			}
		}
		
	}

}
