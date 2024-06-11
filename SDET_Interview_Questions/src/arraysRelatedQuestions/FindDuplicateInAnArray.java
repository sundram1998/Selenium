package arraysRelatedQuestions;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;

/*Given an array a of size N which contains elements from 0 to N-1,
 * you need to find all the elements occurring more than once in the given array.*/
public class FindDuplicateInAnArray {
	
	public static void findDuplicates(int[] arr) {
		HashMap<Integer, Integer> hMap=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hMap.containsKey(arr[i])) {
				hMap.put(arr[i], hMap.get(arr[i])+1);
			}else {
				hMap.put(arr[i], 1);
			}
		}
		for(java.util.Map.Entry<Integer, Integer> entry:hMap.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey()+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,2,3,4,5,5,6,7,7};
		findDuplicates(nums);

	}

}
