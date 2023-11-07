package leetCode;

public class RemoveDuplicateElement {

	public static void removeDuplicates(int[] arr) {
		int i = 0;// 1,1,2
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				i++;
				arr[i] = arr[j];
			}
		}
		for (int k : arr) {
			System.out.print(k+" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 3, 3, 5, 6, 7, 8, 9 };
		removeDuplicates(arr);

	}

}
