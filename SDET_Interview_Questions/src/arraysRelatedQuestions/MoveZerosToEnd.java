package arraysRelatedQuestions;

public class MoveZerosToEnd {
	
	public static void moveZeros(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp=nums[i];
				nums[i]=nums[count];
				nums[count]=temp;
				count++;
			}
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,0,2,0,4,0,5,6,0,7};
		moveZeros(nums);

	}

}
