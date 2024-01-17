package gfgArrays;

public class RemoveDuplicateFromSortedArray {

	public static void removeUsingArray(int[] nums) {
		int size = nums.length;
		int[] newNum = new int[size];
		newNum[0] = nums[0];
		int res=1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				newNum[res] = nums[i];
				res++;
			}
		}
		for (int i = 0; i < newNum.length; i++) {
			System.out.print(newNum[i] + " ");
		}
	}

	public static void removeDuplicates(int[] nums) {
		int res = 1;// { 2, 4, 4, 5, 6, 6, 7 };
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[res-1]) {
				
				nums[res] = nums[i];
				res++;
			}
		}
		for (int i = 0; i < res; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	public static void removeDuplicateI(int[] nums) {
		int res = 0;// { 2, 4, 4, 5, 6, 6, 7 };
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[res]) {
				res++;
				nums[res] = nums[i];
			}
		}
		for (int i = 0; i <= res; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 4, 4, 5, 6, 6, 7 };
//		removeUsingArray(nums);
//		removeDuplicates(nums);
		removeDuplicateI(nums);
	}

}
