package mathematics;

public class CountTrailingZeros {
	
	public static int trailingZeros(int n) {
		int trailingZeros=0;
		for(int i=5;i<n;i=i*5) {
			trailingZeros=trailingZeros+(n/i);
		}
		return trailingZeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(trailingZeros(10));

	}

}
