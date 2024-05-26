package arrays;

public class MinimumAndMax {
	
	public static void minMAx(int[] arr) {
		int l=-1;
		int s=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>l) {
				l=arr[i];
			}
			if(arr[i]<s) {
				s=arr[i];
			}
		}
		System.out.println(l+" "+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,10,3,4,8,9,20,2};
		minMAx(arr);

	}

}
