package gfgArrays;
// sorted non decreasing order
public class IsArraySorted {
	
	public static boolean isSorted(int[] nums) {
		for(int i=1;i<nums.length;i++) {
			if(nums[i-1]>nums[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,4,5,1};
		System.out.println(isSorted(nums));

	}

}
