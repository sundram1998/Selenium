package arraysRelatedQuestions;

public class LeftRotateArrayByOne {
	
	public static void leftRotateByOne(int[] nums) {
		int temp=nums[0];
		for(int i=1;i<nums.length;i++) {
			nums[i-1]=nums[i];
		}
		nums[nums.length-1]=temp;
//		for(int i=0;i<nums.length;i++) {
//			System.out.print(nums[i]+" ");
//		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,68,7,10};
		leftRotateByOne(nums);
	}

}
