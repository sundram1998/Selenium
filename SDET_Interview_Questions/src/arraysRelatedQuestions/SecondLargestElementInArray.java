package arraysRelatedQuestions;

public class SecondLargestElementInArray {
	
	public static int secondLargest(int[] nums) {
		int max=-1;
		int secMax=-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				secMax=max;
				max=nums[i];
			}else if(nums[i]>secMax && nums[i]!=max) {
				secMax=nums[i];
			}
		}
		return secMax;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,2,3,4,5,5,68,7,7};
		System.out.println(secondLargest(nums));;
	}

}
