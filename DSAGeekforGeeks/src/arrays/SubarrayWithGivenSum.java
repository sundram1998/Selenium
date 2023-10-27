package arrays;

public class SubarrayWithGivenSum {

	public static int[] subArray(int[] arr, int target) {
		int[] noRes= {-1,-1};
		int curSum = 0;
		int s = 0;
		for (int e = 0; e < arr.length; e++) {
			curSum += arr[e];
			while (target < curSum) {
				curSum = curSum - arr[s];
				s++;
			}
			if (curSum == target) {
				int[] res= {s,e};
				return res;
			}

		}
		return noRes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,12,2,7};
		int[] res=subArray(arr1, 9);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

	}

}
