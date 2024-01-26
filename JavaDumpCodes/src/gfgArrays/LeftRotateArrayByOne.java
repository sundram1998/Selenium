package gfgArrays;

public class LeftRotateArrayByOne {

	public static int[] reverseArray(int[] nums, int low, int high) {
		while (low < high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
		return nums;
	}

	public static void leftRotateUsingReverse(int[] nums,int n, int d) {
//		int n = nums.length;
		reverseArray(nums, 0, d-1);
		reverseArray(nums, d, n-1);
		reverseArray(nums, 0, n-1);
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void leftRotateByD(int[] nums, int d) {
		int n = nums.length;
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = nums[i];
		}
		for (int i = d; i < n; i++) {// {30,45,6,7,8,9};
			nums[i - d] = nums[i];
		}
		for (int i = 0; i < d; i++) {
			nums[n - d + i] = temp[i];
		}
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void leftRotateByDUsingOneMethod(int[] nums, int d) {
		int n = nums.length;
		for (int i = 0; i < d; i++) {
			leftRotateByOne(nums);
		}

	}

	public static void leftRotateByOne(int[] nums) {
		int n = nums.length;
		int temp = nums[0];
		for (int i = 1; i < n; i++) {// {30,45,6,7,8,9};
			nums[i - 1] = nums[i];
		}
		nums[n - 1] = temp;
		for (int i = 0; i < n; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = { 30, 45, 6, 7, 8, 9 };
//		leftRotate(digits);
//		leftRotateByD(digits, 2);
		leftRotateUsingReverse(digits,digits.length, 6);

	}

}
