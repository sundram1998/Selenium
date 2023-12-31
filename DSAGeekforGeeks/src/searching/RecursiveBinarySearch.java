package searching;

public class RecursiveBinarySearch {

	public static int recursiveBinarySearch(int[] arr, int low, int high, int x) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] == x)
			return mid;
		else if (arr[mid] > x)
			return recursiveBinarySearch(arr, low, mid - 1, x);
		else {
			return recursiveBinarySearch(arr, mid + 1, high, x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(recursiveBinarySearch(arr, 0, arr.length - 1, 50));

	}

}
