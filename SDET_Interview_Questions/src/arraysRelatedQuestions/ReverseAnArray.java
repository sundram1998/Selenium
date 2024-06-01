package arraysRelatedQuestions;

public class ReverseAnArray {
	// You can use for loop as well
	public static void reverseArray(int[] nums) {
		int i=0;
		int j=nums.length-1;
		while(i<=j) {
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<nums.length;k++) {
			System.out.print(nums[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,68,7,};
		reverseArray(nums);

	}

}
