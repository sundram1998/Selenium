package arrays;

import java.util.HashMap;

public class FindIndexOfFirstDuplicate {
	
	public static int findFirstDuplicate(int[] arr) {
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}else {
				map.put(arr[i], map.get(arr[i])+1);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])>1) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,1, 5, 3, 4, 3, 5, 6,1};
		System.out.println(findFirstDuplicate(arr));
	}

}
