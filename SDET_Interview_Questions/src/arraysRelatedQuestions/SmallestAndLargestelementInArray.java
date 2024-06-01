package arraysRelatedQuestions;

/*Given an array,Find the max and min number*/
public class SmallestAndLargestelementInArray {
	
	public static void maxAndMin(int[] nums) {
		int min=nums[0];
		int max=-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
			if(nums[i]<min) {
				min=nums[i];
			}
		}
		System.out.println("Max: "+max+" "+"Min: "+min);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 6, 8, 4, 9, 8, 4, 7, 4, 4 };
		maxAndMin(arr);

	}

}
