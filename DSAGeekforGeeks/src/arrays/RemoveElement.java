package arrays;

import java.util.Arrays;

public class RemoveElement {
	
	public static void removeElement(int[] nums,int val) {
		int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i]=nums[j];
                i++;
            }
        }
        for(int k=0;k<i;k++) {
        	System.out.print(nums[k]+" ");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,2,2,3};
		removeElement(nums, 3);

	}

}
