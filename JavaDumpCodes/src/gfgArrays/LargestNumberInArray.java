package gfgArrays;

public class LargestNumberInArray {
	
	public static int largest(int[] nums) {
		int largest=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[largest]<nums[i]) {
				largest=i;
			}
		}
		return nums[largest];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,4,3,9,5,7,6};
		System.out.println(largest(nums));
	} 

}
