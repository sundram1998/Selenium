package gfgArrays;

public class ReverseArray {

	public static void reverseArray(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low < high) {
			int temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
			low++;
			high--;
		}
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 4, 3, 9, 5, 7, 6 };
		reverseArray(nums);
	}

}
