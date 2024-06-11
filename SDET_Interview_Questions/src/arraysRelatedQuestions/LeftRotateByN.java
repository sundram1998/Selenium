package arraysRelatedQuestions;

public class LeftRotateByN {
	
	public static void  leftRotateByN(int[] nums,int n) {
//		LeftRotateArrayByOne lRotateArrayByOne=new LeftRotateArrayByOne();
		for(int i=0;i<n;i++) {
			LeftRotateArrayByOne.leftRotateByOne(nums);
		}
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,68,7,10};
		leftRotateByN(nums, 4);
	}

}
