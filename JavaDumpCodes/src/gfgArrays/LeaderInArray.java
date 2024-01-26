package gfgArrays;

public class LeaderInArray {
	
	public static void leader(int[] nums) {
		int n=nums.length;
		int largest=nums[n-1];
		for(int i=n-1;i>=0;i--) {
			if(nums[i]>largest || i==(n-1)) {
				System.out.print(nums[i]+" ");
				largest=nums[i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {30, 45, 6, 7, 10, 9,0};
		leader(nums);

	}

}
