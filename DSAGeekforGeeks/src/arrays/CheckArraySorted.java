package arrays;

public class CheckArraySorted {

	public static boolean isSorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[i - 1])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 3, 4, 5, 6, 7 };
		System.out.println(isSorted(num));

	}

}
