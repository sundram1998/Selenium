package gfgArrays;

public class MoveZeros {
	
	public static void efficient(int[] nums) {
		int NoOfNonZero=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp=nums[i];
				nums[i]=nums[NoOfNonZero];
				nums[NoOfNonZero]=temp;// { 30, 45, 0, 0, 6, 0, 7, 0, 8, 0, 9 };
				NoOfNonZero++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
	

	public static void moveZeros(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[j] != 0) {
						int temp = nums[j];// { 30, 45, 0, 0, 6, 0, 7, 0, 8, 0, 9 };
						nums[j] = nums[i];
						nums[i] = temp;
					}
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 30, 0, 45, 0, 6, 0, 7, 0, 8, 0, 9 };
//		moveZeros(arr);
		efficient(arr);
	}

}
