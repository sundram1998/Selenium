package arrays;

public class LeaderInArray {

	public static void getLeader(int[] nums) {
		int curLeader = -1;
		for (int i = nums.length - 1; i >= 0; i--) {
			if (nums[i] >= curLeader || i == nums.length - 1) {
				curLeader = nums[i];
				System.out.print(curLeader + " ");
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {50,3,40,30,10,35,5,4,2,1};
		getLeader(nums);

	}

}
