package stringManipulations;

public class LargestAndSmallestNumInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {14,57,52,20,25,89,1};
		int large=arr[0];
		int small=arr[0];
		for(int i=1;i<arr.length;i++) {
			if (arr[i]>large) {
				large=arr[i];
			}else if (arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println(large);
		System.out.println(small);

	}

}
