package one;

import java.util.Iterator;

/*
 * Given an integer array nums sorted in non-decreasing order,
 *  remove the duplicates in-place such that each unique element appears only once.
 *   The relative order of the elements should be kept the same.
 *  Then return the number of unique elements in nums.
 *  Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
    Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.
    Return k.
 */
public class RemoveDuplicatesFromArray {

	public static int removeDupicates(int[] nums) {
		int i = 0;
		for (int j = 1; j < nums.length; j++) {// 1,1,2
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i + 1;
	}

	/*
	 * Given an integer array nums and an integer val, remove all occurrences of val
	 * in nums in-place. The order of the elements may be changed. Then return the
	 * number of elements in nums which are not equal to val.
	 * 
	 * Consider the number of elements in nums which are not equal to val be k, to
	 * get accepted, you need to do the following things:
	 * 
	 * Change the array nums such that the first k elements of nums contain the
	 * elements which are not equal to val. The remaining elements of nums are not
	 * important as well as the size of nums. Return k.
	 */
	public static void removeDupicatesInUnsortedArray(int[] nums, int val) {
		int i = 0;
		for (int j = 0; j < nums.length; j++) {// 1,1,2
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		System.out.println(i);
		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 2, 3, 3, 4, 4 };
		int[] number = { 2, 2, 4, 3, 3, 4 };
//		System.out.println(removeDupicates(nums));
		removeDupicatesInUnsortedArray(number, 4);

	}

}
