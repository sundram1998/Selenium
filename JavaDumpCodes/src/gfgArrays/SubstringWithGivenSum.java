package gfgArrays;

public class SubstringWithGivenSum {
	
	public static boolean substring(int[] nums,int sum) {
		
		for(int i=0;i<nums.length;i++) {
			int cur=0;
			for(int j=i;j<nums.length;j++) {
				cur+=nums[i];
				if(cur==sum) {
					return true;
				}
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,6,4,7,8};
		System.out.println(substring(nums, 15));

	}

}
