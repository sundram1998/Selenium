package arrays;

public class ReverseArray {
	
	public static void reverseArray(int[] nums) {
		 int low=0;
		 int high=nums.length-1;
		 while(low<high) {
			 int temp=nums[low];
			 nums[low]=nums[high];
			 nums[high]=temp;
			 low++;
			 high--;
		 }
		 for(int i=0;i<nums.length;i++) {
			 System.out.print(nums[i]+" ");
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,2,3,5,6,7,89,0};
		reverseArray(nums);
	}

}
