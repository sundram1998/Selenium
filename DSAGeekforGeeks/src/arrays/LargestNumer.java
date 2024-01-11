package arrays;

public class LargestNumer {
	
	public static int largestNumber(int[] arr) {
		int largest=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {3,4,5,10,6,7};
		System.out.println(largestNumber(num));

	}

}
