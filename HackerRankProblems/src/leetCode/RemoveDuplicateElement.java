package leetCode;

public class RemoveDuplicateElement {

	public static void removeDuplicates(int[] arr) {
		int res = 0;// 1,1,2
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		for (int k=0;k<res;k++) {
			System.out.print(arr[k]+" ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 2, 3, 3, 5, 6, 7, 8, 9 };
		removeDuplicates(arr);

	}

}
