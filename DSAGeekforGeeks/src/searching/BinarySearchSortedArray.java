package searching;

public class BinarySearchSortedArray {

	public static int binarySearch(int[] arr, int x) {
		int high = arr.length - 1;
		int low = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(binarySearch(arr, 50));
	}

}
