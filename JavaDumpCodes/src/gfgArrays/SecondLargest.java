package gfgArrays;

public class SecondLargest {
	
	public static int secondLargest(int[] nums) {
		int largest=0;
		int secLargest=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>nums[largest]) {
				secLargest=largest;
				largest=i;
			}else if(nums[i]>nums[secLargest] && nums[i]!=largest){
				secLargest=i;
			}
		}
		return nums[secLargest];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,4,3,9,5,7,6};
		System.out.println(secondLargest(nums));
	}

}
