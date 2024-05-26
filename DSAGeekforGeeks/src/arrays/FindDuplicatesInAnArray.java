package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class FindDuplicatesInAnArray {

	public static ArrayList<Integer> findDuplicates(int[] arr) {
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!hashMap.containsKey(arr[i])) {
				hashMap.put(arr[i], 1);
			} else {
				hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
			}
		}
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (var el : hashMap.entrySet()) {
			if (el.getValue() > 1) {
				arrayList.add(el.getKey());

			}

		}
		if (arrayList.size() > 0) {
			Collections.sort(arrayList);
		} else {
			arrayList.add(-1);

		}

		return arrayList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 7, 6, 8, 4, 9, 8, 4, 7, 4, 4 };
		System.out.print(findDuplicates(arr) + " ");
	}

}
