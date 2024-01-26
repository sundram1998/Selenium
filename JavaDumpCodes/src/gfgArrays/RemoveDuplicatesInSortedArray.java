package gfgArrays;

public class RemoveDuplicatesInSortedArray {
	
	public static void removeDuplicate(int[] nums) {
		int res=1;
		for(int i=1;i<nums.length;i++) {//{3,3,45,6,7,7,7,7,7,8,9,9};
			if(nums[i]!=nums[res-1]) {
				nums[res]=nums[i];
				res++;
			}
		}
		for(int i=0;i<res;i++) {
			System.out.print(nums[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,3,45,6,7,7,7,7,7,8,9,9};
		removeDuplicate(nums);

	}

}
