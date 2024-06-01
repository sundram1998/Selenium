package arraysRelatedQuestions;

/*There is a sorted array of numbers given,you need to remove the duplicate values*/
public class RemoveDuplicatesFromSortedArray {
	
	public static void removeDuplicates(int[] nums) {
		int i=1;
		for(int j=1;j<nums.length;j++) {
			if(nums[i-1]!=nums[j]) {
				nums[i]=nums[j];
				i++;
			}
		}
		for(int j=0;j<i;j++) {
			System.out.print(nums[j]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,2,3,4,5,5,6,7,7};
		removeDuplicates(nums);

	}

}
