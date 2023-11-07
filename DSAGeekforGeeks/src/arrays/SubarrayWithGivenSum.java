package arrays;

public class SubarrayWithGivenSum {

	public static int[] subArray(int[] arr, int target) {
		int[] noRes= {-1,-1};
		int curSum = 0;
		int startIndex = 0;
		for (int end = 0; end < arr.length; end++) {
			curSum += arr[end];
			while (target < curSum) {
				curSum = curSum - arr[startIndex];
				startIndex++;
			}
			if (curSum == target) {
				int[] res= {startIndex,end};
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
