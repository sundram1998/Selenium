package mathematics;

public class MissingNumberInArray {

	public static void findMissing(int arr[]) {
		int l=arr.length;
		int totalSum=(l+1)*(l+2)/2;
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		int missingInteger=totalSum-sum;
		System.out.println("Missing Number is: "+missingInteger);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 5 };
		findMissing(nums);
	}

}
