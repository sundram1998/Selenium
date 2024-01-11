package arrays;

public class SecondLargest {

	public static int secondLargest(int[] arr) {
		int largest = 0;
		int secLargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secLargest && arr[i] != largest) {
				secLargest = arr[i];
			}
		}
		return secLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 3, 4, 5, 10,9, 6, 7 };
		System.out.println(secondLargest(num));
	}

}
