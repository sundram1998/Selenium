package arrays;

public class MoveAllNegativeNumbersToBeginning {

	public static void moveNegatives(int[] arr) {
//		Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
//		Output: -12 -13 -5 -7 -3 -6 11 6 5
		int i = 0;
		int j = arr.length - 1;
		while (i <= j) {
			if (arr[i] < 0 && arr[j] < 0) {
				i++;
			} else if (arr[i] >= 0 && arr[j] < 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			} else if (arr[i] < 0 && arr[j] >= 0 ||arr[i] >=0 && arr[j] >= 0) {
				j--;
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
		int[] arr = { 12,-12, 11, -13, -5, 6, -7, 5, -3, -6 ,9};
		moveNegatives(arr);

	}

}
