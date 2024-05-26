package arrays;

public class ReverseAnArray {

	public static void reverseArray(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 3, 4, 5, 10, 9, 6, 7 };
		reverseArray(num);
	}

}
